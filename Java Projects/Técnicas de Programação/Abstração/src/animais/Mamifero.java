/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author japa
 */
public abstract class Mamifero extends Animal{

    public Mamifero(String n) 
    {
        super(n);
    }
    
    public abstract void talk();
    
}
