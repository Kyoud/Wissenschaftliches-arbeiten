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
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Wilkommen zum Maximum Flow tester!");
        //Kanten initalisieren
        Kante kante1 = new Kante("E1",10);
        Kante kante2 = new Kante("E2",10);
        Kante kante3 = new Kante("E3",5);
        Kante kante4 = new Kante("E4",10);
        Kante kante5 = new Kante("E5",10);
        
        Knoten knoten1 = new Knoten("V1",true, false);
        Knoten knoten2 = new Knoten("V2",false, false);
        Knoten knoten3 = new Knoten("V3",false, false);
        Knoten knoten4 = new Knoten("V4",false, true);
        
        List<Kante> volgekanten = new ArrayList<Kante>();
        volgekanten.add(kante1);
        volgekanten.add(kante2);
        knoten1.setVolgekanten(volgekanten);
        
        List<Kante> vorkanten = new ArrayList<Kante>();
        vorkanten.add(kante1);
        knoten2.setVorkanten(vorkanten);
        
        vorkanten.clear();
        vorkanten.add(kante3);
        knoten3.setVorkanten(vorkanten);
        
        
        
    }
    
}
