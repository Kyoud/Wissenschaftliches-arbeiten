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
public class Knoten {
    private boolean quelle;
    private boolean senke;
    private List<Kante> vorkanten = new ArrayList<Kante>();
    private List<Kante> volgekanten = new ArrayList<Kante>();
    private String name;
    
    Knoten(String n, boolean q, boolean s){
        quelle = q;
        senke = s;
        name = n;
        System.out.println("Knoten erstellt: "+ n);
    }

    /**
     * @return the quelle
     */
    public boolean isQuelle() {
        return quelle;
    }

    /**
     * @param quelle the quelle to set
     */
    public void setQuelle(boolean quelle) {
        this.quelle = quelle;
    }

    /**
     * @return the senke
     */
    public boolean isSenke() {
        return senke;
    }

    /**
     * @param senke the senke to set
     */
    public void setSenke(boolean senke) {
        this.senke = senke;
    }

    /**
     * @return the vorkanten
     */
    public List<Kante> getVorkanten() {
        return vorkanten;
    }

    /**
     * @param vorkanten the vorkanten to set
     */
    public void setVorkanten(List<Kante> vorkanten) {
        this.vorkanten = vorkanten;
    }

    /**
     * @return the volgekanten
     */
    public List<Kante> getVolgekanten() {
        return volgekanten;
    }

    /**
     * @param volgekanten the volgekanten to set
     */
    public void setVolgekanten(List<Kante> volgekanten) {
        this.volgekanten = volgekanten;
    }
}
