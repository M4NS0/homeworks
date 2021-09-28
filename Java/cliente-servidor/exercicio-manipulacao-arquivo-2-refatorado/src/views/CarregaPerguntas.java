package views;

import model.PessoaFisica;
import model.PessoaJuridica;
import model.Telefone;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CarregaPerguntas {

    public boolean desejaInserirPF() {
        String resposta = "";
        resposta = JOptionPane.showInputDialog("Deseja incluir uma nova pessoa juridica? \n SIM \n NAO");
        if (resposta.equalsIgnoreCase("sim")) {
            return true;
        }
        else if (resposta.equalsIgnoreCase("nao") || resposta.equalsIgnoreCase("não")) {
            return false;
        } else return false;
    }

    public PessoaFisica inserirPF(int ultimoID) {
        PessoaFisica pessoa = new PessoaFisica();
        Telefone telefone = new Telefone();
        List<Telefone> telefones = new ArrayList<>();

        // id,CPF,nome,cidade,estado,status,Telefones list
        pessoa.setID(ultimoID+1);
        pessoa.setNome(JOptionPane.showInputDialog("Digite o nome completo\n"));
        pessoa.setCPF(JOptionPane.showInputDialog("Digite o CPF\n"));
        pessoa.setEstado(JOptionPane.showInputDialog("Digite o estado\n"));
        pessoa.setCidade(JOptionPane.showInputDialog("Digite a cidade\n"));
        pessoa.setStatus(JOptionPane.showInputDialog("Digite o Status \nAtiva \nInativa \n"));

        telefone.setCelular(JOptionPane.showInputDialog("Digite o telefone celular"));
        telefone.setContato(JOptionPane.showInputDialog("Digite o telefone contato"));
        telefone.setComercial(JOptionPane.showInputDialog("Digite o telefone comercial"));

        telefones.add(telefone);
        pessoa.setTelefones(telefones);

        return pessoa;
    }
}
