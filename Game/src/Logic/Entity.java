/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author ozmarescobar
 * 
 */
public class Entity
{
    public int hp;
    public int mp;
    public int atk;
    public int physDef;
    public int magDef;
    public int speed;
    public int critChance;
    public int critMultiplier;
    public int intelligence;//used for offensive magic, also factor to confusing resistance
    public int spirit;//used for defensive magic
    
    public Immunity[] inmunidades;
    public Resistance[] resistencias;
}
