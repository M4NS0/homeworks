package App;

import models.*;
import services.DAO;
import services.LerAgencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {

    private static ArrayList<Permissao> listaNegados;
    private static ArrayList<Permissao> listaPermitidas;

    public static void main(String[] args) {
        getContaInAgencia(getDTOInFile());
        gerarArquivoComTransacoesPermitidas();
        gerarArquivoComTransacoesNegadas();
    }



    private static Agencia getDTOInFile() {
        List<DTO> listaDTO = new ArrayList<>();
        LerAgencia dadosAgencia = new LerAgencia();
        Agencia agencia;
        listaDTO = carregaCSV(listaDTO);

        agencia = dadosAgencia.getDados(listaDTO);
        return agencia;
    }

    private static void getContaInAgencia(Agencia agencia) {
        for (Conta conta :
                agencia.getContas()) {
            getTransacoesInConta(conta);
        }
    }

    private static void getTransacoesInConta(Conta conta) {
        for (Transacao transacao :
                conta.getTransacoes()) {
            getResultadosInTransacoes(transacao);
        }
    }

    private static void getResultadosInTransacoes(Transacao transacao) {
        for (Resultado resultado :
                transacao.getResultados()) {
            getTransacoesPermitidasInResultados(resultado);
            getTransacoesNegadasInResultados(resultado);

        }
    }

    private static void getTransacoesNegadasInResultados(Resultado resultado) {
        listaNegados = new ArrayList<>();
        if (resultado.getTransacoesNegadas() != null) {
            for (Permissao permissao :
                    resultado.getTransacoesNegadas()) {
                if (resultado.getTransacoesNegadas() != null)
                    listaNegados.add(permissao);
            }
        }
        ordenaLista(listaNegados);
    }


    private static void getTransacoesPermitidasInResultados(Resultado resultado) {
        listaPermitidas = new ArrayList<>();

        if (resultado.getTransacoesPermitidas() != null) {
            for (Permissao permissao :
                    resultado.getTransacoesPermitidas()) {

                listaPermitidas.add(permissao);
            }
        }
        ordenaLista(listaPermitidas);
    }

    private static List<Permissao> ordenaLista(List<Permissao> lista) {
        Collections.sort(lista);
        return lista;

    }

    private static List<DTO> carregaCSV(List<DTO> listaDTO) {
        DAO dao = new DAO();
        listaDTO = dao.ReadFile();
        return listaDTO;
    }

    private static void gerarArquivoComTransacoesNegadas() {
        DAO dao = new DAO();
        dao.WriteFilePermitidos(listaPermitidas);
    }

    private static void gerarArquivoComTransacoesPermitidas() {
        DAO dao = new DAO();
        dao.WriteFileNegados(listaNegados);

    }


}
