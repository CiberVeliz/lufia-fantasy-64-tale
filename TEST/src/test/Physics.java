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
public abstract class Physics {
    
    Acceleration acceleration;
    Gravity gravity;
    Friction friction;
    Mass mass;
    Speed speed;
    
    public void setAcceleration(double xi, double xf, double yi, double yf, double t){
        
        this.acceleration = new Acceleration(xi, xf, yi, yf, t);
        
    }
    
}
