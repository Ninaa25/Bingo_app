/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transfer;

import java.io.Serializable;

/**
 *
 * @author nina
 */
public class So implements Serializable{
    
    private Object odgovor;
    private String poruka;
    private Operacije operacija;

    public So() {
    }

    public So(Object odgovor, String poruka, Operacije operacija) {
        this.odgovor = odgovor;
        this.poruka = poruka;
        this.operacija = operacija;
    }


    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    public Object getOdgovor() {
        return odgovor;
    }

    public void setOdgovor(Object odgovor) {
        this.odgovor = odgovor;
    }

    public Operacije getOperacija() {
        return operacija;
    }

    public void setOperacija(Operacije operacija) {
        this.operacija = operacija;
    }
    
    
    
}
