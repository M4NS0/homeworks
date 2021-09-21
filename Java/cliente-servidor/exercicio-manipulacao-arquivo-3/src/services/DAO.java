package services;

import models.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DAO {
    public static final String NOME_ARQUIVO_LEITURA = "src/assets/TransacoesBancarias.csv";


    public List<Todos> ReadFile() {
        String[]  coluna;
        String linha = "";
        List<Todos> lista = new ArrayList<>();

        try {

            FileReader fr = new FileReader(NOME_ARQUIVO_LEITURA);
            BufferedReader br = new BufferedReader(fr);

            Todos todosDados;
            String cabecalho = br.readLine();
            coluna =  cabecalho.split(";");
            linha = br.readLine();

            do {
                todosDados = mapearDados(linha);
                lista.add(todosDados);
                linha = br.readLine();

            } while (linha != null);

        } catch (FileNotFoundException e) {
            e.printStackTrace(); //ajustar
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lista;
    }

    private Todos mapearDados(String linha) {
        Todos todosDados = new Todos();
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
}
