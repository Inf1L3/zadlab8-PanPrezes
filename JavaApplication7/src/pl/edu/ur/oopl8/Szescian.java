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
public class Szescian extends FiguraPrzestrzenna {

    private double a;

    public Szescian(double a) {
        this.a = a;
    }

    Szescian(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Szescian(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double obliczObjetosc() {
        return Math.pow(a, 3);
    }

    @Override
    public double obliczPole() {
        return 6 * Math.pow(a, 2);
    }

    @Override
    public String toString() {
        return super.toString() + "\nDlugosc krawedzi a: " + a + "\nPole powierzchni szescianu: " + obliczPole() + "\nObjetosc szescianu: " + obliczObjetosc();
    }
}
