package App;

import controle.Controle;
import models.*;

import java.util.List;

public class Teste {

    private static Controle controle;

    public static void main(String[] args) {
        runControler();
    }

    private static void runControler() {

        controle = new Controle();
        controle.start();

        List<DTO> listaDTO;
        listaDTO = controle.getDTOinFile();

        List<Agencia> agencias;
        agencias = controle.getAgenciasFromListaDTO(listaDTO);

        List<Conta> contas;
        contas = controle.getContasFromAgencias(agencias);

        List<Transacao> transacoes;
        transacoes = controle.getTransacoesFromContas(contas);

        // extracao
        List<Resultado> resultados;
        resultados = controle.getResultadosFromTransacoes(transacoes);

        List<Permissao> permitidas;
        permitidas = controle.getResultadosPermitidos(resultados);

        List<Permissao> negados;
        negados = controle.getResultadosNegados(resultados);

        controle.gravaCSVnegados(negados);
        controle.gravaCSVpermitidos(permitidas);

    }











}
