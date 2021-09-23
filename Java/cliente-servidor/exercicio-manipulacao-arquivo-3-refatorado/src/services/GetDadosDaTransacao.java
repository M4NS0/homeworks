package services;

import models.DTO;
import models.Resultado;
import models.Transacao;

import java.util.ArrayList;
import java.util.List;

public class GetDadosDaTransacao {
    public List<Transacao> getListaVerificada(DTO dado) {
        Transacao transacao = new Transacao();
        GetResultadosTransacao resultado = new GetResultadosTransacao();
        List<Transacao> lista = new ArrayList<>();

        transacao.setOperacao(dado.getOperacaoTransacao());
        transacao.setId(dado.getIdTransacao());
        transacao.setDataOperacao(dado.getDataOperacaoTransacao());
        transacao.setValor(dado.getValorTransacao());
        transacao.setPermitido(calculaTransacao(dado.getSaldoConta(), dado.getValorTransacao()));
        transacao.setCodigo(dado.getCodigoTransacao());
        transacao.setResultados(resultado.getListaResultado(dado, transacao.getPermitido()));

        lista.add(transacao);

        return lista;
    }

    private Boolean calculaTransacao(Double saldoConta, Double valorTransacao) {
        if (saldoConta < valorTransacao) {
            return false;
        } else return true;
    }
}
