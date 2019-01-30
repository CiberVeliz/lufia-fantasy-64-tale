/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

/**
 *
 * @author pablunsky
 */
public class Underlay extends Element{
 
    LinkedList<Wall> blocks;
    
    Rectangle Top, Bottom, Left, Right;
    
    int x, y;
    
    public Underlay(String bg) {
        super(0, 0, bg);
        this.movement = new Movement();
        
        Bottom = new Rectangle(Frame.LEFT_CONSTRAINT, Frame.BOTTOM_CONSTRAINT, 5000, 1);
        Top = new Rectangle(Frame.LEFT_CONSTRAINT, Frame.TOP_CONSTRAINT, 5000, 1);
        Left = new Rectangle(Frame.LEFT_CONSTRAINT, Frame.TOP_CONSTRAINT, 1, 5000);
        Right = new Rectangle(Frame.RIGHT_CONSTRAINT, Frame.TOP_CONSTRAINT, 1, 5000);
        
        
    }

    @Override
    public void Paint(Graphics gr) {
        gr.drawImage(getSprite(), movement.getCurrentPosX(), movement.getCurrentPosY(), null);
    }

    @Override
    public void MoveRIGHT() {
        movement.setCurrentPosX(movement.getCurrentPosX()-3);
    }

    @Override
    public void MoveUP() {
        movement.setCurrentPosY(movement.getCurrentPosY()+3);
    }

    @Override
    public void MoveLEFT() {
        movement.setCurrentPosX(movement.getCurrentPosX()+3);
    }

    @Override
    public void MoveDOWN() {
        movement.setCurrentPosY(movement.getCurrentPosY()-3);
    }

    @Override
    public void Stop() {
        
    }
    
    
    
}
