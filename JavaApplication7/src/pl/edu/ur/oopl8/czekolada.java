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
public class czekolada extends Product {

    public czekolada (double cena,String nazwa,  String opis) {
        super(cena, nazwa, opis);
    }

    public void kup() {
        System.out.println(
                "kupuje czekoladę");
    }

    public void pokażInfo() {
        System.out.println(
                "Cena:" + getCena()
                + " nazwa:" + getNazwa()
                + " opis:" + getOpis()
        );
    }
}

