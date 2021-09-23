package services;

import models.DTO;
import models.Permissao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    public static final String NOME_ARQUIVO_LEITURA = "src/assets/TransacoesBancarias.csv";
    public static final String NOME_ARQUIVO_ESCRITA_PERMITIDOS = "src/assets/TransacoesBancariasPermitidas.csv";
    public static final String NOME_ARQUIVO_ESCRITA_NEGADOS = "src/assets/TransacoesBancariasNegados.csv";


    public List<DTO> ReadFile() {
        String[]  coluna;
        String linha = "";
        List<DTO> listaDTO = new ArrayList<>();

        try {

            FileReader fr = new FileReader(NOME_ARQUIVO_LEITURA);
            BufferedReader br = new BufferedReader(fr);

            DTO todosDados;
            String cabecalho = br.readLine();
            coluna =  cabecalho.split(";");
            linha = br.readLine();

            do {
                todosDados = mapearDados(linha);
                listaDTO.add(todosDados);
                linha = br.readLine();

            } while (linha != null);

        br.close();
        fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaDTO;
    }

    private DTO mapearDados(String linha) {
        DTO todosDados = new DTO();
        String[] campo;
        if (linha != null) {
            campo =linha.split(";");
            if (campo != null && campo.length > 0) {
                todosDados.setIdAgencia(Integer.parseInt(campo[0]));
                todosDados.setCodigoAgencia(Integer.parseInt(campo[1]));
                todosDados.setNomeAgencia(campo[2]);
                todosDados.setIdConta(Integer.parseInt(campo[3]));
                todosDados.setNumeroConta(Integer.parseInt(campo[4]));
                todosDados.setDvConta(Integer.parseInt(campo[5]));
                todosDados.setDataAberturaConta(campo[6]);
                todosDados.setLimiteConta(Double.parseDouble(campo[7]));
                todosDados.setSaldoConta(Double.parseDouble(campo[8]));
                todosDados.setIdTransacao(Integer.parseInt(campo[9]));
                todosDados.setCodigoTransacao(Integer.parseInt(campo[10]));
                todosDados.setDataOperacaoTransacao(campo[11]);
                todosDados.setOperacaoTransacao(campo[12]);
                todosDados.setValorTransacao(Double.parseDouble(campo[13]));
            }
        }
        return todosDados;

    }

    public void WriteFilePermitidos(List<Permissao> lista) {
        try {
            FileWriter fw = new FileWriter(NOME_ARQUIVO_ESCRITA_PERMITIDOS);

            for (int i = 0; i < lista.size(); i ++) {
                createCSV(fw, lista, i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void WriteFileNegados (List<Permissao> lista) {
        try {
            FileWriter fw = new FileWriter(NOME_ARQUIVO_ESCRITA_NEGADOS);

            for (int i = 0; i < lista.size(); i ++) {
                createCSV(fw, lista, i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void createCSV(FileWriter fw, List<Permissao> lista, int i) {
        try {
            fw.write(lista.get(i).getId() +
                    ";" + lista.get(i).getDataOperacao() +
                    ";" + lista.get(i).getValor() +
                    ";" + lista.get(i).getPermitido() +
                    ";" + lista.get(i).getCodigo() +
                    ";" + lista.get(i).getPermitido() +
                    ";" + lista.get(i).getCodigo() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
