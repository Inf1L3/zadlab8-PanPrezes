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
public class Walec extends FiguraPrzestrzenna{

    private double r;
    private double h;

    public Walec(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double obliczObjetosc() {
        return Math.PI*Math.pow(r,2)*h;
    }

    @Override
    public double obliczPole() {
        return 2*Math.PI*r*(r+h);
    }

    @Override
    public String toString() {
        return super.toString()+"\nPromien walca: "+r+"\nWysokosc walca: "+h+"\nPole powierzchni walca: "+obliczPole()+"\nObjetosc walca: "+obliczObjetosc();
    }
}
