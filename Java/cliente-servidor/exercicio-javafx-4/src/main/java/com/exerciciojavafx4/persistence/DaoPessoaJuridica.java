package com.exerciciojavafx4.persistence;

import com.exerciciojavafx4.models.PessoaJuridica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DaoPessoaJuridica {
    public static final String NOME_ARQUIVO_LEITURA = "src/main/java/com/exerciciojavafx4/assets/PessoaJuridica.csv";
    public static final String NOME_ARQUIVO_ESCRITA = NOME_ARQUIVO_LEITURA;

    /**
     * Método que lê pessoas juridicas de um arquivo CSV
     *
     * @return Lista de pessoa Juridica
     */

    public List<PessoaJuridica> getAll() {
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

            // passar objeto com erro para negocio
        }
        return pessoas;
    }

    /**
     * Método que mapeia uma linha do arquivo CSV para um objeto Pessoa Juridica
     *
     * @param linha cada uma que for lidas do arquivo CSV
     * @return Objeto Pessoa Juridica para ser adicionado na lista para camada de negocio
     */
    private PessoaJuridica mapearPessoaJuridica(String linha) {
        PessoaJuridica pessoa = new PessoaJuridica();

        try {
            String[] campo;
            if (linha != null) {
                campo = linha.split(";");
                if (campo != null && campo.length > 0) {
                    pessoa.setId(Integer.parseInt(campo[0]));
                    pessoa.setCnpj(campo[1]);
                    pessoa.setRazaoSocial(campo[2]);
                    pessoa.setCidade(campo[3]);
                    pessoa.setEstado(campo[4]);
                    pessoa.setPagamento(campo[5]);
                    pessoa.setStatus(campo[6]);
                }
            }

        } catch (Exception e) {
            System.err.printf(e.getMessage() + "\n");
        }

        return pessoa;
    }

    /**
     * Método que salva uma pessoa juridica no arquivo CSV
     *
     * @param pessoas em lista recebidas da camada de negocio
     */
    public void save(List<PessoaJuridica> pessoas) {
        try {
            FileWriter writer = new FileWriter(NOME_ARQUIVO_ESCRITA);
            for (PessoaJuridica pessoa : pessoas) {
                writer.write(pessoa.getId() + ";" +
                        pessoa.getCnpj() + ";" +
                        pessoa.getRazaoSocial() + ";" +
                        pessoa.getCidade() + ";" +
                        pessoa.getEstado() + ";" +
                        pessoa.getPagamento() + ";" +
                        pessoa.getStatus() + "\n");
            }
            writer.flush();
            writer.close();

        } catch (IOException e) {
            System.err.printf(e.getMessage() + "\n");

            // passar objeto com erro para negocio
        }
    }

}