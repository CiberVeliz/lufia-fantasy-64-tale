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
public abstract class Element {
    
    int x, y;
    
    public abstract Sprite Paint();
    
    public abstract void MoveXRIGHT();
    public abstract void MoveYUP();
    
    public abstract void MoveXLEFT();
    public abstract void MoveYDOWN();
    
    public abstract void Stop();
    
    
}
