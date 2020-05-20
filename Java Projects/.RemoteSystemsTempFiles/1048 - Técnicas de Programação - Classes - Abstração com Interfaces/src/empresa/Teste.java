/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author japa
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa gerencia = new Gerente();
        Pessoa  coord = new Coordenador();
        //Pessoa pessoa = new Pessoa();
        
        gerencia.setNome("Joao");
        gerencia.setId(1000);
        coord.setNome("Maria");
        coord.setId(2000);
        gerencia.calculaSalario();
        System.out.println("");
        coord.calculaSalario();
    }
    
}
