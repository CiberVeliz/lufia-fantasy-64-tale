/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author pablunsky
 */
class Acceleration {
    
    double ax;
    double ay;
    
    public Acceleration(double xi, double xf, double yi, double yf, double t){
        ax = (xf - xi) / t;
        ay = (yf - yi) / t;
    }
    
}
