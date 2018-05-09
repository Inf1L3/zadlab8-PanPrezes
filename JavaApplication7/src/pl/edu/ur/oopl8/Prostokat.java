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
public class Prostokat extends FiguraPlaska{

    private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double obliczObwod() {
        return 2*a+2*b;
    }

    @Override
    public double obliczPole() {
        return a*b;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDlugosc boku a: "+a+"\nDlugosc boku b: "+b+"\nPole prostokata: "+obliczPole()+"\nObwod prostokata: "+obliczObwod();
    }
}