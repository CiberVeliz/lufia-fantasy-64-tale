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
public class Character extends Element{
    
    Rectangle Bounds;
    
    public Character(int x, int y, int width, int height, String sprite) {
        super(width, height, sprite);
        this.movement = new Movement(x, y);
        Bounds = new Rectangle(movement.getCurrentPosX(), movement.getCurrentPosY(), width, height);
    }

    @Override
    public void Paint(Graphics gr) {
        
        gr.drawImage(getSprite(), movement.getCurrentPosX(), movement.getCurrentPosY(), null);
        Bounds = new Rectangle(movement.getCurrentPosX(), movement.getCurrentPosY(), width, height);
        
    }

    @Override
    public void MoveRIGHT() {
        movement.moveRight();
    }

    @Override
    public void MoveUP() {
        movement.moveUp();
    }

    @Override
    public void MoveLEFT() {
        movement.moveLeft();
    }

    @Override
    public void MoveDOWN() {
        movement.moveDown();
    }

    @Override
    public void Stop() {
        movement.stop();
    }
    
}
