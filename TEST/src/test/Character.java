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
    
    Sprite sprite;
    double maxspeed;
    
    double speed;

    public Character(int x, int y, int width, int height, double maxspeed, String sprite) {
        super(width, height);
        
        this.sprite = new Sprite(sprite);
        this.x = x;
        this.y = y;
        this.maxspeed = maxspeed;
        speed = 1;
    }

    @Override
    public void Paint(Graphics gr) {
        
        gr.drawImage(sprite.img, x, y, null);
        gr.drawRect(x, y, width, height);
        
        
    }

    @Override
    public void MoveXRIGHT() {
        if(speed < maxspeed){
            speed += 0.01;
        }
        x += 10 * speed;
    }

    @Override
    public void MoveYUP() {
        
        if(speed < maxspeed){
            speed += 0.01;
        }
        y -= 10 * speed;
        
    }

    @Override
    public void MoveXLEFT() {
        if(speed < maxspeed){
            speed += 0.01;
        }
        x -= 10 * speed;
    }

    @Override
    public void MoveYDOWN() {
        if(speed < maxspeed){
            speed += 0.01;
        }
        y += 10 * speed;
    }

    @Override
    public void Stop() {
        speed = 1;
    }
    
}
