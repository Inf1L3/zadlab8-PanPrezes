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


public abstract class Product {

    private double cena;
    private String nazwa;
    private String opis;

    public double getCena() {
        return cena;
    }

    public void setPrice(double cena) {
        this.cena = cena;
    }

    public abstract void kup();

    public abstract void pokażInfo();

    public Product(double cena, String nazwa, String opis) {
        this.cena = cena;
        this.nazwa = nazwa;
        this.opis = opis;
    }

   
    public String getNazwa() {
        return "Product{" + "nazwa=" + nazwa + '}';
    }

    
    public String getOpis() {
        return "Product{" + "opis=" + opis + '}';
    }

  
    
}

