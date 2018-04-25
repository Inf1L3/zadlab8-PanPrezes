/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl8;

/**
 *
 * @author Patryk
 */
public class polopiryna extends Product {
  
    public polopiryna( double cena,String nazwa,  String opis) {
        super(cena, nazwa, opis);
    }

    public void kup() {
        System.out.println(
                "kupuje polopirynę");
    }

    public void pokażInfo() {
        System.out.println(
                "Price:" + getCena()
                + " name:" + getNazwa()
                + " describe:" + getOpis()
        );
    }
} 

