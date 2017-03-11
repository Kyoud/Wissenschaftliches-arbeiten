/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kyodu
 */
public class Kante {
    private int kapazitaet;
    private Knoten vorknoten;
    private List<Knoten> volgeknoten = new ArrayList<Knoten>();
    private boolean besucht;
    private String name;
    
    Kante(String n, int k){
        kapazitaet = k;
        besucht = false; 
        name =n;
    }

    /**
     * @return the kapazitaet
     */
    public int getKapazitaet() {
        return kapazitaet;
    }

    /**
     * @param kapazitaet the kapazitaet to set
     */
    public void setKapazitaet(int kapazitaet) {
        this.kapazitaet = kapazitaet;
    }

    /**
     * @return the vorknoten
     */
    public Knoten getVorknoten() {
        return vorknoten;
    }

    /**
     * @param vorknoten the vorknoten to set
     */
    public void setVorknoten(Knoten vorknoten) {
        this.vorknoten = vorknoten;
    }

    /**
     * @return the volgeknoten
     */
    public List<Knoten> getVolgeknoten() {
        return volgeknoten;
    }

    /**
     * @param volgeknoten the volgeknoten to set
     */
    public void setVolgeknoten(List<Knoten> volgeknoten) {
        this.volgeknoten = volgeknoten;
    }

    /**
     * @return the besucht
     */
    public boolean isBesucht() {
        return besucht;
    }

    /**
     * @param besucht the besucht to set
     */
    public void setBesucht(boolean besucht) {
        this.besucht = besucht;
    }
}
