package services;

import models.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manipulacao {
    public List<Agencia> getDadosAgencia(List<DTO> listaDTO) {
        Agencia agencia = new Agencia();

        List<Conta> contas;
        List<Agencia> agencias = new ArrayList<>();

        for (DTO dado :
                listaDTO) {
            agencia.setId(dado.getIdAgencia());
            agencia.setNome(dado.getNomeAgencia());
            agencia.setCodigo(dado.getCodigoAgencia());
            contas = getDadosConta(dado); // V
            agencia.setContas(contas);
            agencias.add(agencia);
        }
        return agencias;
    }

    public List<Conta> getDadosConta(DTO dado) {
        Conta conta = new Conta();
        List<Conta> lista = new ArrayList<>();
        List<Transacao> transacoes;

        conta.setId(dado.getIdConta());
        conta.setDataAbertura(dado.getDataAberturaConta());
        conta.setDv(dado.getDvConta());
        conta.setSaldo(dado.getSaldoConta());
        conta.setLimite(dado.getLimiteConta());
        conta.setNumero(dado.getNumeroConta());

        transacoes = getListaTransacoes(dado);  // V

        conta.setTransacoes(transacoes);
        lista.add(conta);

        return lista;
    }

    public List<Transacao> getListaTransacoes(DTO dado) {
        Transacao transacao = new Transacao();
        List<Transacao> lista = new ArrayList<>();

        transacao.setOperacao(dado.getOperacaoTransacao());
        transacao.setId(dado.getIdTransacao());
        transacao.setDataOperacao(dado.getDataOperacaoTransacao());
        transacao.setValor(dado.getValorTransacao());
        transacao.setPermitido(calculaTransacao(dado.getSaldoConta(), dado.getValorTransacao()));
        transacao.setCodigo(dado.getCodigoTransacao());
        transacao.setResultados(getListaResultados(dado, transacao.getPermitido()));

        lista.add(transacao);

        return lista;
    }

    private Boolean calculaTransacao(Double saldoConta, Double valorTransacao) {
        if (saldoConta < valorTransacao) {
            return false;
        } else return true;
    }

    public List<Resultado> getListaResultados(DTO dado, Boolean permitido) {
        Resultado resultado = new Resultado();
        List<Resultado> resultados = new ArrayList<>();

        resultado.getId(dado.getIdTransacao() + 100);
        resultado.setDataHoraProcessamento(getDataEhora());

        if (permitido == true) {
            resultado.setTransacoesPermitidas(getListaComPermissoes(dado, true, getDataEhora()));
        } else resultado.setTransacoesNegadas(getListaComPermissoes(dado, false, getDataEhora()));

        resultados.add(resultado);
        return resultados;
    }


    private LocalDate getDataEhora() {
        LocalDate dataEhora = LocalDate.now();
        return dataEhora;

    }

    public List<Permissao> getListaComPermissoes (DTO dado, Boolean permitido, LocalDate dataEhora) {
        List<Permissao> permissoes = new ArrayList<>();
        Permissao permissao = new Permissao();

        if (permitido == true) {
            permissao.setPermitido("Permitido");
            permissao.setCodigo(dado.getCodigoTransacao() + "P");
        } else{
            permissao.setPermitido("Não Permitido");
            permissao.setCodigo(dado.getCodigoTransacao() + "NP");
        }

        permissao.setId(dado.getIdTransacao() + 10);
        permissao.setDataOperacao(dataEhora);
        permissao.setValor(dado.getValorTransacao());

        permissoes.add(permissao);

        return permissoes;
    }


}


