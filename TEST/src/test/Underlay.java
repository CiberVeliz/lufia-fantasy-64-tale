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
 
    LinkedList<Wall> blocks;

    public Underlay(String bg) {
        super(0, 0, bg);
        this.movement = new Movement();
    }

    @Override
    public void Paint(Graphics gr) {
        gr.drawImage(getSprite(), movement.getCurrentPosX(), movement.getCurrentPosY(), null);
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
