/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Graphics;

/**
 *
 * @author pablunsky
 */
public abstract class Element {
    
    
    int x, y, width, height;
    
    
    public Element(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    public abstract void Paint(Graphics gr);
    
    public abstract void MoveXRIGHT();
    public abstract void MoveYUP();
    
    public abstract void MoveXLEFT();
    public abstract void MoveYDOWN();
    
    public abstract void Stop();
    
    
}
