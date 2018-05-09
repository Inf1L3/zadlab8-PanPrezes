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
public class Main {
    public static void main(String[] args) {


        FiguraGeometryczna[] figury = new FiguraGeometryczna[15];

        figury[0] = new Kwadrat(5);
        figury[1] = new Szescian(2.2);
        figury[2] = new Prostokat(4, 6) {};
        figury[3] = new Prostopadloscian(1, 5, 7);
        figury[4] = new Trojkat(8, 10);
        figury[5] = new Stozek(5, 4, 5);
        figury[6] = new Trapez(12, 4, 5, 5, 6);
        figury[7] = new Romb(5, 4.3);
        figury[8] = new Kolo(3.9);
        figury[9] = new Kula(2);
        figury[10] = new Rownoleglobok(2, 4, 3);
        figury[11] = new Walec(5,5);
        figury[12] = new Prostokat(2,9);
        figury[13] = new Szescian(22);
        figury[14] = new Kwadrat(1.2);

        int i=0;
        while (i < 15){
            System.out.println(figury[i].toString());
            i++;
        }
    }
}
