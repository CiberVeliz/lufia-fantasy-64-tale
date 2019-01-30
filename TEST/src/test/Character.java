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
public class Character extends Element{
    
    public Character(int x, int y, int width, int height, String sprite) {
        super(width, height, sprite);
        this.movement = new Movement(x, y);
    }

    @Override
    public void Paint(Graphics gr) {
        
        gr.drawImage(getSprite(), movement.getCurrentPosX(), movement.getCurrentPosY(), null);
        gr.drawRect(movement.getCurrentPosX(), movement.getCurrentPosY(), width, height);
        
        
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
