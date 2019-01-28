/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;
import javax.swing.JPanel;

/**
 *
 * @author pablunsky
 */
public class Scope extends JPanel{
    
    LinkedList<Element> elements;

    public Scope(LinkedList<Element> elements) {
        super();
        this.elements = elements;
        
    }
    
    public void Refresh(Graphics gr){
        
        for(Element e: elements){
            
            Sprite s  = e.Paint();
            
            gr.drawImage(s.img, e.x, e.y, null);
            
        }
        
    }
    
    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        Refresh(graphics);
    }
    
    public void Up(){
        for(Element e: elements){
            e.MoveYUP();
        }
    }
    
    
    public void Down(){
        for(Element e: elements){
            e.MoveYDOWN();
        }
    }
    
    public void Stop(){
        for(Element e: elements){
            e.Stop();
        }
    }
    
    public void Left(){
        for(Element e: elements){
            e.MoveXLEFT();
        }
    }
    
    
    public void Right(){
        for(Element e: elements){
            e.MoveXRIGHT();
        }
    }
    
}
