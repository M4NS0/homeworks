package app;

import models.PessoaFisica;
import models.Telefone;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LerArquivoDeTextoMapeado {
    public static final String NOME_ARQUIVO_LEITURA = "src/assets/PessoaFisica.csv";
    public static final String NOME_ARQUIVO_ESCRITA = "src/assets/PessoaFisicaNew.csv";
    private static String[]  coluna;

    public static void main(String[] args) {
        List<PessoaFisica> lista = new LerArquivoDeTextoMapeado().obterPessoaJuridica(NOME_ARQUIVO_LEITURA);
        for (PessoaFisica pessoaFisica: lista) {
            System.out.println(pessoaFisica.getId() + " " + pessoaFisica.getNome() + " " + pessoaFisica.getTelefones().toString());
        }
        try {
            writeFile(lista, NOME_ARQUIVO_ESCRITA);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void writeFile(List<PessoaFisica> lista, String nomeArquivoEscrita) throws IOException {
        FileWriter writer = new FileWriter(nomeArquivoEscrita);

        for (PessoaFisica pessoa: lista) {
            writer.write(pessoa.toString() + "\n" );
        }
        writer.close();

    }


    private List<PessoaFisica>  obterPessoaJuridica(String nomeArquivo) {
        List<PessoaFisica> lista = new ArrayList<>();

        try {
            PessoaFisica pessoaFisica;
            FileReader fr = new FileReader(nomeArquivo);
            BufferedReader br = new BufferedReader(fr);

            String linha = br.readLine();
            coluna = linha.split(";");
            linha = br.readLine();

            do {
                pessoaFisica = mapearPessoaFisica(linha);
                lista.add(pessoaFisica);
                linha = br.readLine();

            } while (linha != null);

            Collections.sort(lista);
            fr.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  lista;
    }

    private PessoaFisica mapearPessoaFisica(String linha) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        Telefone telefone = new Telefone();
        List<Telefone> telefones = new ArrayList<>();

        try {
            String[] campos;
            if (linha != null ){
                campos = linha.split(";");
                if (campos !=null && campos.length > 0) {

                    pessoaFisica.setId(Integer.parseInt(campos[0]));
                    pessoaFisica.setCpf(campos[1]);
                    pessoaFisica.setNome(campos[2]);
                    pessoaFisica.setCidade(campos[3]);
                    pessoaFisica.setEstado(campos[4]);
                    pessoaFisica.setStatus(campos[5]);

                    if (campos.length == 7) {
                        telefone.setCelular(campos[6]);
                        telefone.setContato("s/n");
                        telefone.setComercial("s/n");
                    } else if (campos.length == 8) {
                        telefone.setCelular(campos[6]);
                        telefone.setContato(campos[7]);
                        telefone.setComercial("s/n");
                    }

                    else  {
                        telefone.setCelular(campos[6]);
                        telefone.setContato(campos[7]);
                        telefone.setComercial(campos[8]);
                    }

                    telefones.add(telefone);
                    }
                    pessoaFisica.setTelefones(telefones);
                }

        } catch (Exception e) {
            e.printStackTrace();
            System.err.printf(e.getMessage() + "\n");
        }

        return pessoaFisica;
    }

}
