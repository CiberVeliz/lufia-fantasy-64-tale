/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Graphics;
import java.util.LinkedList;

/**
 *
 * @author pablunsky
 */
public class Underlay extends Element{
 
    Sprite background;
    LinkedList<Wall> blocks;

    public Underlay(String bg) {
        super(0, 0);
        x = 0;
        y = 0;
        this.background = new Sprite(bg);
    }

    @Override
    public void Paint(Graphics gr) {
        gr.drawImage(background.img, x, y, null);
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
