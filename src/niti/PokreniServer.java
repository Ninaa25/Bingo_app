/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package niti;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nina
 */
public class PokreniServer extends Thread{

    ServerSocket ss;
    
    
    
    @Override
    public void run() {

        try {
            ss = new ServerSocket(9000);
            System.out.println("Server pokrenut!");

        } catch (IOException ex) {
            Logger.getLogger(PokreniServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while (true) {            
            try {
                Socket soket = ss.accept();
                System.out.println("Klijent povezan!");
                ObradaKZ okz = new ObradaKZ(soket);
                okz.start();
                
            } catch (IOException ex) {
                Logger.getLogger(PokreniServer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    
    
}
