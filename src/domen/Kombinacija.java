/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author nina
 */
public class Kombinacija implements Serializable{
    
    private ArrayList<String> kombinacija;
    private int naMestu;
    private int nisuNaMestu;
    private int rb;

    public Kombinacija() {
        kombinacija = new ArrayList<>();
    }

    public Kombinacija(ArrayList<String> kombinacija, int naMestu, int nisuNaMestu, int rb) {
        this.kombinacija = kombinacija;
        this.naMestu = naMestu;
        this.nisuNaMestu = nisuNaMestu;
        this.rb = rb;
    }

    public int getRb() {
        return rb;
    }

    public void setRb(int rb) {
        this.rb = rb;
    }

    public ArrayList<String> getKombinacija() {
        return kombinacija;
    }

    public void setKombinacija(ArrayList<String> kombinacija) {
        this.kombinacija = kombinacija;
    }

    public int getNaMestu() {
        return naMestu;
    }

    public void setNaMestu(int naMestu) {
        this.naMestu = naMestu;
    }

    public int getNisuNaMestu() {
        return nisuNaMestu;
    }

    public void setNisuNaMestu(int nisuNaMestu) {
        this.nisuNaMestu = nisuNaMestu;
    }

    @Override
    public String toString() {
        return kombinacija+" ";
    }
    
    
    
}
