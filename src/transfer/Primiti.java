/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transfer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nina
 */
public class Primiti implements Serializable{
    
    Socket soket;

    public Primiti(Socket soket) {
        this.soket = soket;
    }
    
    public Object primi(){
        try {
            ObjectInputStream ois = new ObjectInputStream(soket.getInputStream());
            return ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(Primiti.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Primiti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
