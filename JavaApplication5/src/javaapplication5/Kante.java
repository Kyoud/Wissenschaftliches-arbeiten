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
    
    Kante(int k, Knoten vk, List<Knoten> volk){
        kapazitaet = k;
        vorknoten = vk;
        volgeknoten = volk;
        besucht = false;      
    }
}
