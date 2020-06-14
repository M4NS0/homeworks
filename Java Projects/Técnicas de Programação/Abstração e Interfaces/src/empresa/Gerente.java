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
public class Gerente extends Pessoa /*implements Funcionario*/{


    @Override
    public void calculaSalario() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Id  : " + this.getId());
        System.out.println("Salario de R$ 10.000,00");
    }
   
}
