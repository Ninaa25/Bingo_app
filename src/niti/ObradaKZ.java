/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package niti;

import domen.Kombinacija;
import java.net.Socket;
import logika.Kontroler;
import transfer.Kz;
import transfer.Operacije;
import transfer.Poslati;
import transfer.Primiti;
import transfer.So;

/**
 *
 * @author nina
 */
public class ObradaKZ extends Thread{
    
    Socket soket;
    Primiti primiti;
    Poslati poslati;

    public ObradaKZ(Socket soket) {
        this.soket = soket;
        primiti = new Primiti(soket);
        poslati = new Poslati(soket);
    }

    @Override
    public void run() {
        while (true) {            
            
            Kz kz = (Kz) primiti.primi();
            So so = new So();
            
            switch (kz.getOperacija()) {
                case proveriKombinaciju:
                    Kombinacija k = (Kombinacija) kz.getParametar();
                    k = Kontroler.getInstance().proveriK(k);
                    so.setOdgovor(k);
                    break;
                default:
                    throw new AssertionError();
            }
            poslati.posalji(so);
        }
    }
    
    
}
