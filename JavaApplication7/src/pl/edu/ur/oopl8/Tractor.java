/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package pl.edu.ur.oopl8;

public class Tractor extends Product {

    public Tractor( double cena,String nazwa,  String opis) {
        super(cena, nazwa, opis);
    }

    public void kup() {
        System.out.println(
                "kupuje traktor");
    }

    public void pokażInfo() {
        System.out.println(
                "Cena:" + getCena()
                + " nazwa:" + getNazwa()
                + " opis:" + getOpis()
        );
    }
}
    

