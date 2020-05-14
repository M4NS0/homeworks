/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaisabstract;

/**
 *
 * @author japa
 */
public  class Cachorro extends Mamifero{

    public Cachorro(String n) 
    {
        super(n);
    }
    
    public  void talk()
    {
        System.out.println("Au...Au...");
    }
    
}