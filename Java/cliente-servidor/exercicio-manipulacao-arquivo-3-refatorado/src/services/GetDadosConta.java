package services;

import models.Conta;
import models.DTO;
import models.Transacao;

import java.util.ArrayList;
import java.util.List;

public class GetDadosConta {
    public List<Conta> getDados(DTO dado) {
        Conta conta = new Conta();
        GetDadosDaTransacao transacao = new GetDadosDaTransacao();

        List<Conta> lista = new ArrayList<>();
        List<Transacao> transacoes = new ArrayList<>();

        conta.setId(dado.getIdConta());
        conta.setDataAbertura(dado.getDataAberturaConta());
        conta.setDv(dado.getDvConta());
        conta.setSaldo(dado.getSaldoConta());
        conta.setLimite(dado.getLimiteConta());
        conta.setNumero(dado.getNumeroConta());

        transacoes = transacao.getListaVerificada(dado);

        conta.setTransacoes(transacoes);
        lista.add(conta);

        return lista;
    }
}
