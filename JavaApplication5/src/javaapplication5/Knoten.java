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
    
    Knoten(boolean q, boolean s, List<Kante> vork, List<Kante>volk){
        System.out.println("Knoten erstellt");
        quelle = q;
        senke = s;
        vorkanten = vork;
        volgekanten = volk;
    }
}
