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

public class zad3 {

    public static void main(String[] args) {
        
        Product[] n = new Product[10];
        n[0] = new książka(39.99, "Love,Rosie", "Dramat romantyczny");
        n[1] = new czekolada(3.68, "czekolada Wedel", "mleczna");
        n[2] = new książka(16.80, "A.B.C", "Kryminał");
        n[3] = new długopis(1.99, "Pelikan", "czarny");
        n[4] = new dżem(2.99, "Owocowy Sad", "malinowy");
        n[5] = new polopiryna(20, "polopiryna", "lek");
        n[6] = new dżem(3.80, "Słodka rozkosz", "truskawkowy");
        n[7] = new czekolada(4.50, "Milka", "Tiramisu");
        n[8] = new długopis(1.00, "Bic", "niebieski");
        n[9] = new Tractor(20000, "Ursus", "Pojazd rolniczy");
        
        for(int i=0; i < n.length; i++){
            System.out.println();
            n[i].kup();
            n[i].pokażInfo();
        }
        System.out.println();
    }
    
}
