/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logika;

import domen.Kombinacija;
import forme.KlijentForma;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import transfer.Kz;
import transfer.Operacije;
import transfer.Poslati;
import transfer.Primiti;
import transfer.So;

/**
 *
 * @author nina
 */
public class Kontroler {
    
    
    private static Kontroler instance;
    Socket soket;
    Primiti primiti;
    Poslati poslati;  
    KlijentForma kf;
    JLabel l1;
    JLabel l2;
    int brojac;

    public static Kontroler getInstance() {
        if (instance == null) {
            instance = new Kontroler();
        }
        return instance;
    }

    private Kontroler() {
        
        try {
            soket = new Socket("localhost", 9000);
            System.out.println("Konektovan!");
            primiti = new Primiti(soket);
            poslati = new Poslati(soket);    
            brojac = 0;
        } catch (IOException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setKf(KlijentForma kf) {
        this.kf = kf;
    }

    public void setL2(JLabel l2) {
        this.l2 = l2;
    }

    public void setL1(JLabel l1) {
        this.l1 = l1;
    }

    public void posaljiKombinaciju(Kombinacija k) {

        brojac++;
        if (brojac > 6) {
            JOptionPane.showMessageDialog(null, "Imali ste 6 pokusaja!");
            System.exit(0);
        }
        
        Kz kz = new Kz(k, Operacije.proveriKombinaciju);
        poslati.posalji(kz);
        So so = (So) primiti.primi();
        Kombinacija komb = (Kombinacija) so.getOdgovor();
        
        l1.setText( String.valueOf(komb.getNaMestu()));
        l2.setText( String.valueOf(komb.getNisuNaMestu()));
        
        if (komb.getNaMestu()== 4) {
            JOptionPane.showMessageDialog(null, "Pogodili ste!");
            System.exit(0);
        }
        
        
        
    }
    
    
}
