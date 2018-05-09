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
public class Romb extends FiguraPlaska{

    private double a;
    private double h;

    public Romb(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double obliczObwod() {
        return 4*a;
    }

    @Override
    public double obliczPole() {
        return a*h;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDlugosc boku a: "+a+"\nWysokosc rombu: "+h+"\nPole rombu: "+obliczPole()+"\nObwod rombu: "+obliczObwod();
    }
    
}
