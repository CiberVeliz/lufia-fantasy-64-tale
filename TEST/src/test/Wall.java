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
public class Wall extends Element{

    public Wall(int x, int y, int width, int height){
        super(width, height);
        this.x = x;
        this.y = y;
                
    }
    
    @Override
    public void Paint(Graphics gr) {
        
        
    }

    @Override
    public void MoveXRIGHT() {
        
    }

    @Override
    public void MoveYUP() {
        
    }

    @Override
    public void MoveXLEFT() {
        
    }

    @Override
    public void MoveYDOWN() {
        
    }

    @Override
    public void Stop() {
        
    }
    
    
    
    
}
