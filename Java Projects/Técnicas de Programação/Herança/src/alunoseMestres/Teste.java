package alunoseMestres;
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
        /*Pessoas goku = new Pessoas("Goku", 44, 8001, "CMP1048");
        Pessoas mestreKame = new Pessoas("Kame", 400, 5000, "CMP1048");
        Pessoas kuririn = new Pessoas("Kuririn", 30, 2000, "CMP1046");
        Pessoas vegeta = new Pessoas("Vegeta", 50, 7000, "CMP1046");
        */
        Mestres kame = new Mestres ("CMP1048", "Kame", 400 );
        Mestres kaio = new Mestres ("CMP1046", "Kaio", 5000);
        
        Alunos goku = new Alunos (8001, "Goku", 44);
        Alunos kuririn = new Alunos (2000, "Kuririn", 30);
        
        System.out.println("Nome: " + goku.getNome()); 
        System.out.println("Nome: " + goku.getMatricula()); 
        
        System.out.println("Nome: " + kame.getNome()); 
        System.out.println("Nome: " + kame.getMateria()); 
        

    }
    
}
