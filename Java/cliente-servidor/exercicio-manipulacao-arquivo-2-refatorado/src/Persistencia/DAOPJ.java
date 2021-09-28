package Persistencia;

import model.PessoaFisica;
import model.PessoaJuridica;
import model.Telefone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DAOPJ {
    public static final String NOME_ARQUIVO_LEITURA = "src/assets/PessoaJuridica.csv";
    public static final String NOME_ARQUIVO_ESCRITA = "src/assets/new/PessoaJuridica.csv";

    public List<PessoaJuridica> LerPessoaJuridica() {
        String linha = "";
        List<PessoaJuridica> pessoas = new ArrayList<>();

        try {

            FileReader fr = new FileReader(NOME_ARQUIVO_LEITURA);
            BufferedReader br = new BufferedReader(fr);

            PessoaJuridica pessoa;
            br.readLine();
            linha = br.readLine();

            do {
                pessoa = mapearPessoaJuridica(linha);
                pessoas.add(pessoa);
                linha = br.readLine();

            } while (linha != null);

            br.close();
            fr.close();

        } catch (IOException e) {
            System.err.printf(e.getMessage() + "\n");
        }
        return pessoas;
    }

    private PessoaJuridica mapearPessoaJuridica(String linha) {
        PessoaJuridica pessoa = new PessoaJuridica();
        Telefone telefone = new Telefone();
        List<Telefone> telefones = new ArrayList<>();
        try {
            String[] campo;
            if (linha != null) {
                campo = linha.split(";");
                if (campo != null && campo.length > 0) {
                    pessoa.setID(Integer.parseInt(campo[0]));
                    pessoa.setCNPJ(campo[1]);
                    pessoa.setRazaoSocial(campo[2]);
                    pessoa.setCidade(campo[3]);
                    pessoa.setEstado(campo[4]);
                    pessoa.setAvista(campo[5]);
                    pessoa.setStatus(campo[6]);
                }
            }

        } catch (Exception e) {
            System.err.printf(e.getMessage() + "\n");
        }

        return pessoa;
    }

    public void PersistirPessoaJuridica(List<PessoaJuridica> pessoas) {
        try {
            FileWriter writer = new FileWriter(NOME_ARQUIVO_ESCRITA);
            for (PessoaJuridica pessoa: pessoas) {
                writer.write(pessoa.getID() + ";" +
                        pessoa.getRazaoSocial() + ";" +
                        pessoa.getCNPJ() + ";" +
                        pessoa.getStatus()+ "\n");
            }
            writer.flush();
            writer.close();

        } catch (IOException e) {
            System.err.printf(e.getMessage() + "\n");
        }
    }


}