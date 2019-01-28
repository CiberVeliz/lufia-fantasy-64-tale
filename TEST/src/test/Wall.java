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
        super(width, height, null);
        this.movement = new Movement(x,y);
    }
    
    @Override
    public void Paint(Graphics gr) {
        
        
    }

    @Override
    public void MoveRIGHT() {
        
    }

    @Override
    public void MoveUP() {
        
    }

    @Override
    public void MoveLEFT() {
        
    }

    @Override
    public void MoveDOWN() {
        
    }

    @Override
    public void Stop() {
        
    }
    
    
    
    
}
