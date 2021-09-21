package app;

import models.PessoaJuridica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LerArquivoDeTextoMapeado {
    public static final String NOME_ARQUIVO = "src/assets/PessoaJuridica.csv";
    public static void main(String[] args) {
        List<PessoaJuridica> lista = new LerArquivoDeTextoMapeado().obterPessoaJuridica(NOME_ARQUIVO);

        for (PessoaJuridica pessoaJuridica: lista) {
            System.out.println(pessoaJuridica.getId() +  " " + pessoaJuridica.getRazaoSocial());
        }
    }

    private List<PessoaJuridica> obterPessoaJuridica(String nomeArquivo) {
        List<PessoaJuridica> lista = new ArrayList<>();

        try {
            PessoaJuridica pessoaJuridica;
            FileReader fr = new FileReader(nomeArquivo);
            BufferedReader br = new BufferedReader(fr);

            String linha = br.readLine();

            do {
                pessoaJuridica = mapearPessoaJuridica(linha);
                lista.add(pessoaJuridica);

                linha = br.readLine();
            } while (linha != null);

            Collections.sort(lista);
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lista;
    }

    private PessoaJuridica mapearPessoaJuridica(String linha) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        try {
            String[] campos;
            if (linha != null) {
                campos = linha.split(";");
                if (campos != null && campos.length > 0) {
                    pessoaJuridica.setId(Integer.parseInt(campos[0]));
                    pessoaJuridica.setCnpj(campos[1]);
                    pessoaJuridica.setRazaoSocial(campos[2]);
                    pessoaJuridica.setCidade(campos[3]);
                    pessoaJuridica.setEstado(campos[4]);
                    pessoaJuridica.setTipoPagamento(campos[5]);
                    pessoaJuridica.setStatus(campos[6]);
                }
            }
        } catch (Exception e) {
            System.err.printf(e.getMessage());
        }
        return pessoaJuridica;
    }
}
