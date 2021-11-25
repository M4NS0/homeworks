package com.example.trabalhojavafxtabela.persistence;

import com.example.trabalhojavafxtabela.models.DTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DaoPessoaFisica {
    public static final String NOME_ARQUIVO_LEITURA = "src/main/java/com/example/trabalhojavafxtabela/assets/PessoaFisica.csv";

    public List<DTO> getAll() {
        String linha = "";
        List<DTO> pessoas = new ArrayList<>();

        try {

            FileReader fr = new FileReader(NOME_ARQUIVO_LEITURA);
            BufferedReader br = new BufferedReader(fr);

            DTO dto;
            br.readLine();
            linha = br.readLine();

            do {
                dto = mapearPessoaFisica(linha);
                pessoas.add(dto);
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

    private DTO mapearPessoaFisica(String linha) {
        DTO dto = new DTO();

        try {
            String[] campo;
            if (linha != null) {
                campo = linha.split(";");
                if (campo != null && campo.length > 0) {
                    dto.setId(Integer.parseInt(campo[0]));
                    dto.setCpf(campo[1]);
                    dto.setNome(campo[2]);
                    dto.setCidade(campo[3]);
                    dto.setEstado(campo[4]);
                    dto.setStatus(campo[5]);
                    if (campo.length == 7) {
                        dto.setCelular(campo[6]);
                        dto.setContato("s/n");
                        dto.setComercial("s/n");
                    } else if (campo.length == 8) {
                        dto.setCelular(campo[6]);
                        dto.setContato(campo[7]);
                        dto.setComercial("s/n");
                    } else {
                        dto.setCelular(campo[6]);
                        dto.setContato(campo[7]);
                        dto.setComercial(campo[8]);
                    }
                }
            }

        } catch (Exception e) {
            System.err.printf(e.getMessage() + "\n");
        }
        return dto;

    }
}
