/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.LinkedList;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author pablunsky
 */
public class Scope extends JPanel{
    
    Character character;
    Underlay underlay;

    public Scope(Character c, Underlay u) {
        super();
        this.character = c;
        this.underlay = u;
        
    }
    
    public void Refresh(Graphics gr){
        
        underlay.Paint(gr);
        character.Paint(gr);
        
    }
    
    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        Refresh(graphics);
    }
    
    public void Up(){
        
        character.MoveUP();
        if(character.Bounds.intersects(underlay.Top)){
            underlay.MoveUP();
            
        }
    }
    
    
    public void Down(){
        
        character.MoveDOWN();
        if(character.Bounds.intersects(underlay.Bottom)){
            underlay.MoveDOWN();
        }
        
    }
    
    public void Stop(){
        
        character.Stop();
        underlay.Stop();
        
    }
    
    public void Left(){
        
        character.MoveLEFT();
        
        if(character.Bounds.intersects(underlay.Left)){
            underlay.MoveLEFT();
        }
        
    }
    
    
    public void Right(){
        
        character.MoveRIGHT();
        
        if(character.Bounds.intersects(underlay.Right)){
            underlay.MoveRIGHT();
        }
        
    }
    
}
