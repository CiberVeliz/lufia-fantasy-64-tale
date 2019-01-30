/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author pablunsky
 */
public abstract class Element {
    
    
    int width, height;
    Sprite sprite;
    Movement movement;
    
    
    public Element(int width, int height, String sprite){
        this.width = width;
        this.height = height;
        this.sprite = new Sprite(sprite);
        
        this.movement = null;
    }
    
    public BufferedImage getSprite()
    {
        return sprite.img;
    }
    
    public abstract void Paint(Graphics gr);
    
    public abstract void MoveRIGHT();
    public abstract void MoveUP();
    
    public abstract void MoveLEFT();
    public abstract void MoveDOWN();
    
    public abstract void Stop();
    
    
}
