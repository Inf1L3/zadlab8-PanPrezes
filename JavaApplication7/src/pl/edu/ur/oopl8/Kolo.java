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
public class Kolo extends FiguraPlaska{

    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double obliczObwod() {
        return 2*Math.PI*r;
    }

    public double obliczPole() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public String toString() {
        return super.toString()+"\nPromien kola: "+r+"\nPole kola: "+obliczPole()+"\nObwod kola: "+obliczObwod();
    }

    @Override
    public void obliczPole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
