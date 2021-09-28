package controlador;

import Persistencia.DAOPF;
import Persistencia.DAOPJ;
import model.PessoaFisica;
import model.PessoaJuridica;
import views.CarregaPerguntas;

import java.util.Collections;
import java.util.List;

public class Controle {

    public void iniciar() {
        iniciarPessoaFisica();
        iniciarPessoaJuridica();
    }

    private void persisteDadosPF(List<PessoaFisica> pessoas) {
        DAOPF dao = new DAOPF();
        dao.PersistirPessoaFisica(pessoas);
    }

    private void printaListaPFEmTerminal(List<PessoaFisica> pessoas) {
        System.out.println("\n-- Lista de pessoas Fisicas -- ");
        for (PessoaFisica pessoa : pessoas) {
            System.out.println(
                    pessoa.getID() + " " +
                            pessoa.getNome() + " " +
                            pessoa.getTelefones().get(0)
            );
        }
    }

    private void ordenaListaPF(List<PessoaFisica> pessoas) {
        Collections.sort(pessoas);
    }

    private List<PessoaFisica> carregarListaPF() {
        List<PessoaFisica> pessoas;
        DAOPF dao = new DAOPF();

        pessoas = dao.LerPessoaFisica();
        return pessoas;
    }

    private void iniciarPessoaFisica() {
        List<PessoaFisica> pessoas;
        pessoas = carregarListaPF();
        PessoaFisica pessoa;
        CarregaPerguntas pergunta = new CarregaPerguntas();

        int ultimoID = pessoas.get(pessoas.size() - 1).getID();
        inserirPF(pergunta);

        do {
            pessoa = pergunta.inserirPF(ultimoID);
            pessoas.add(pessoa);
        } while (inserirPF(pergunta) == true);


        ordenaListaPF(pessoas);
        printaListaPFEmTerminal(pessoas);
        persisteDadosPF(pessoas);
    }

    private boolean inserirPF(CarregaPerguntas pergunta) {
        return pergunta.desejaInserirPF();

    }

    private List<PessoaJuridica> carregarListaPJ() {
        List<PessoaJuridica> pessoas;
        DAOPJ dao = new DAOPJ();

        pessoas = dao.LerPessoaJuridica();
        return pessoas;
    }

    private void iniciarPessoaJuridica() {
        List<PessoaJuridica> pessoas;
        pessoas = carregarListaPJ();

        ordenaListaPJ(pessoas);
        printaListaPJEmTerminal(pessoas);
        persisteDadosPJ(pessoas);
    }


    private void persisteDadosPJ(List<PessoaJuridica> pessoas) {
        DAOPJ dao = new DAOPJ();
        dao.PersistirPessoaJuridica(pessoas);
    }

    private void printaListaPJEmTerminal(List<PessoaJuridica> pessoas) {
        System.out.println("\n-- Lista de pessoas Juridicas -- ");
        for (PessoaJuridica pessoa : pessoas) {
            System.out.println(
                    pessoa.getID() + " " +
                            pessoa.getRazaoSocial() + " " +
                            pessoa.getCNPJ() + " " +
                            pessoa.getAvista() + " " +
                            pessoa.getStatus()
            );
        }
    }

    private void ordenaListaPJ(List<PessoaJuridica> pessoas) {
        Collections.sort(pessoas);
    }


}
