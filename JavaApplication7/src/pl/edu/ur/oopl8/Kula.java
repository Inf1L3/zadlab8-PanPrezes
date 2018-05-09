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
public abstract class Kula extends FiguraPrzestrzenna{

    private double r;

    public Kula(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double obliczObjetosc() {
        return (4*Math.PI*Math.pow(r,3))/3;
    }

    @Override
    public double obliczPole() {
        return 4*Math.PI*Math.pow(r,2);
    }

    @Override
    public String toString() {
        return super.toString()+"\nDlugosc promienia kuli: "+r+"\nPole powierzchni kuli: "+obliczPole()+"\nObjetosc kuli: "+obliczObjetosc();
    }
}
