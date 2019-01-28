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
    
    
    LinkedList<Element> elements;

    public Scope(LinkedList<Element> elements) {
        super();
        
        this.elements = elements;
        
    }
    
    public void Refresh(Graphics gr){
        
        
        for(Element e: elements){
            e.Paint(gr);
        }
        
    }
    
    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        Refresh(graphics);
    }
    
    public void Up(){
        for(Element e: elements){
            e.MoveUP();
        }
    }
    
    
    public void Down(){
        for(Element e: elements){
            e.MoveDOWN();
        }
    }
    
    public void Stop(){
        for(Element e: elements){
            e.Stop();
        }
    }
    
    public void Left(){
        for(Element e: elements){
            e.MoveLEFT();
        }
    }
    
    
    public void Right(){
        for(Element e: elements){
            e.MoveRIGHT();
        }
    }
    
}
