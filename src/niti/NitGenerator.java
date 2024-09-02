/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package niti;

import javax.swing.JLabel;

/**
 *
 * @author nina
 */
public class NitGenerator extends Thread{

    boolean kraj;
    JLabel l1;
    

    public NitGenerator(JLabel l1) {
        this.l1 = l1;
        kraj=false;
    }
    
    
    @Override
    public void run() {
        while (!kraj) {            
            
            int b1 = (int) Math.round(Math.random() * 9);            
            l1.setText(String.valueOf(b1));
            
        }
        
        
    }

    public void zaustavi() {

        kraj = true;
    }
    
    
    
    
}
