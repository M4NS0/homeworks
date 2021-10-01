package persistencia;

import model.PessoaJuridica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DAOPJ {
    public static final String NOME_ARQUIVO_LEITURA = "src/assets/PessoaJuridica.csv";
    public static final String NOME_ARQUIVO_ESCRITA = "src/assets/new/PessoaJuridica.csv";

    /**
     * Método que lê pessoas juridicas de um arquivo CSV
     * @return Lista de pessoa Juridica
     */

    public List<PessoaJuridica> lerPessoaJuridica() {
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

    private PessoaJuridica mapearPessoaJuridica(String linha) {
        PessoaJuridica pessoa = new PessoaJuridica();

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

    public void persistirPessoaJuridica(List<PessoaJuridica> pessoas) {
        try {
            FileWriter writer = new FileWriter(NOME_ARQUIVO_ESCRITA);
            for (PessoaJuridica pessoa : pessoas) {
                writer.write(pessoa.getID() + ";" +
                        pessoa.getRazaoSocial() + ";" +
                        pessoa.getCNPJ() + ";" +
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