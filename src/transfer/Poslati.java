/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transfer;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nina
 */
public class Poslati implements Serializable{
    
    Socket soket;

    public Poslati(Socket soket) {
        this.soket = soket;
    }
    
    public void posalji(Object o){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(soket.getOutputStream());
            oos.writeObject(o);
        } catch (IOException ex) {
            Logger.getLogger(Poslati.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
