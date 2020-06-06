/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author japa
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Animal objAnimal = new Animal("Bicho");
        //Animal objMamifero = new Mamifero("Todos...");
        //Animal objPassaro = new Passaro("Todos...");
        Animal cao = new Cachorro("Boxer");
        Animal preta = new Vaca("Nelore");
        Animal passarinho = new BemTeVi("Papo Amarelo");
        
        System.out.println(cao.getNome());
        cao.talk();
        System.out.println(preta.getNome());
        preta.talk();
        System.out.println(passarinho.getNome());
        passarinho.talk();
        
        Mamifero cao2 = new Cachorro("Pointer");
        System.out.println(cao2.getNome());
        cao.talk();    
        
        Animal passarinho2 = new BemTeVi("Papo Verde");
        System.out.println(passarinho2.getNome());
        passarinho.talk();   
        
        Vaca pintada = new Vaca("Holandesa");
        System.out.println(pintada.getNome());
        pintada.talk();   
    }
    
}
