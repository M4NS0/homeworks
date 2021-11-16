package com.example.trabalhojavafxtabela.persistence;

import com.example.trabalhojavafxtabela.models.PessoaFisica;
import com.example.trabalhojavafxtabela.models.Telefone;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DaoPessoaFisica {
    public static final String NOME_ARQUIVO_LEITURA = "src/main/java/com/example/trabalhojavafxtabela/assets/PessoaFisica.csv";

    public List<PessoaFisica> getAll() {
        String linha = "";
        List<PessoaFisica> pessoas = new ArrayList<>();

        try {

            FileReader fr = new FileReader(NOME_ARQUIVO_LEITURA);
            BufferedReader br = new BufferedReader(fr);

            PessoaFisica pessoa;
            br.readLine();
            linha = br.readLine();

            do {
                pessoa = mapearPessoaFisica(linha);
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

    private PessoaFisica mapearPessoaFisica(String linha) {
        PessoaFisica pessoa = new PessoaFisica();
        Telefone telefone = new Telefone();

        List<Telefone> telefones = new ArrayList<>();
        try {
            String[] campo;
            if (linha != null) {
                campo = linha.split(";");
                if (campo != null && campo.length > 0) {
                    pessoa.setId(Integer.parseInt(campo[0]));
                    pessoa.setCpf(campo[1]);
                    pessoa.setNome(campo[2]);
                    pessoa.setCidade(campo[3]);
                    pessoa.setEstado(campo[4]);
                    pessoa.setStatus(campo[5]);
                    if (campo.length == 7) {
                        telefone.setCelular(campo[6]);
                        telefone.setContato("s/n");
                        telefone.setComercial("s/n");
                    } else if (campo.length == 8) {
                        telefone.setCelular(campo[6]);
                        telefone.setContato(campo[7]);
                        telefone.setComercial("s/n");
                    } else {
                        telefone.setCelular(campo[6]);
                        telefone.setContato(campo[7]);
                        telefone.setComercial(campo[8]);
                    }
                    telefones.add(telefone);
                }
                pessoa.setTelefones(telefones);
            }

        } catch (Exception e) {
            System.err.printf(e.getMessage() + "\n");
        }

        return pessoa;
    }
}
