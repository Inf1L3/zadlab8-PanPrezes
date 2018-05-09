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
public abstract class FiguraPlaska extends FiguraGeometryczna {

    public abstract double obliczObwod();

    @Override
    public String toString() {
        return "\nObliczanie parametrow figury plaskiej.\n";
    }
    
}
