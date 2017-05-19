/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg313clasificacionliga;

import java.text.Collator;

/**
 *
 * @author sergio
 */
public class Equipo implements Comparable<Equipo>{
    private int gc;
    private int gf;
    private String nombre;
    private int pe;
    private int pg;
    private int pp;

    public int getGc() {
        return gc;
    }

    public void setGc(int gc) {
        this.gc = gc;
    }

    public int getGf() {
        return gf;
    }

    public void setGf(int gf) {
        this.gf = gf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPe() {
        return pe;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public int getPg() {
        return pg;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public Equipo(int gc, int gf, String nombre, int pe, int pg, int pp) {
        this.gc = gc;
        this.gf = gf;
        this.nombre = nombre;
        this.pe = pe;
        this.pg = pg;
        this.pp = pp;
    }
    
    public Integer calculaPuntos(){
        return this.pe*1+this.pg*3;
    }
    
    public Integer average(){
        return this.gf-this.gc;
    }

    @Override
    public int compareTo(Equipo o) {
        Collator alfabeto=Collator.getInstance();
        alfabeto.setStrength(Collator.PRIMARY);
        int[] criterios={this.calculaPuntos().compareTo(o.calculaPuntos()),
        this.average().compareTo(o.average()),
        alfabeto.compare(this.getNombre(), o.getNombre())};
        for(int una:criterios){
            if(una!=0){
                return una;
            }
        }
        return 0;
    }
    
    public int partidosJugados(){
        return this.pg+this.pe+this.pp;
    }
    
}
