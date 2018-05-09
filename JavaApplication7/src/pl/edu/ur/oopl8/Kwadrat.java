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
public class Kwadrat extends FiguraPlaska {

    private double a;

    public Kwadrat(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double obliczObwod() {
        return 4*a;
    }

    @Override
    public double obliczPole() {
        return a*a;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDlugosc boku kwadratu: "+a+"\nPole kwadratu: "+obliczPole()+"\nObwod kwadratu: "+obliczObwod();
    }
}
