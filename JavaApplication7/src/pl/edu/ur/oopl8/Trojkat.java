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
public class Trojkat extends FiguraPlaska{

    private double a;
    private double h;

    public Trojkat(double a, double h) {
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
        return 3*a;
    }

    @Override
    public double obliczPole() {
        return (a*h)/2;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDlugosc podstawy: "+a+"\nWysokosc trojkata: "+h+"\nPole trojkata: "+obliczPole()+"\nObwod trojkata: "+obliczObwod();
    }
}