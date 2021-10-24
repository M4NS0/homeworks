package services;

import models.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manipulacao {
    public List<Agencia> getAgenciaFromListaDTO(List<DTO> listaDTO) {
        Agencia agencia = new Agencia();
        List<Conta> contas;
        List<Agencia> agencias = new ArrayList<>();

        for (DTO dado :
                listaDTO) {
            agencia.setId(dado.getIdAgencia());
            agencia.setNome(dado.getNomeAgencia());
            agencia.setCodigo(dado.getCodigoAgencia());
            contas = getContaFromListaDTO(listaDTO); // V
            agencia.setContas(contas);
            agencias.add(agencia);
        }
        return agencias;
    }

    public List<Conta> getContaFromListaDTO(List<DTO> listaDTO) {
        Conta conta = new Conta();
        List<Conta> lista = new ArrayList<>();

        for (int i = 0; i < listaDTO.size(); i++) {
            conta.setId(listaDTO.get(i).getIdConta());
            conta.setDv(listaDTO.get(i).getDvConta());
            conta.setSaldo(listaDTO.get(i).getSaldoConta());
            conta.setLimite(listaDTO.get(i).getLimiteConta());
            conta.setNumero(listaDTO.get(i).getNumeroConta());
            conta.setDataAbertura(listaDTO.get(i).getDataAberturaConta());

            conta.setTransacoes(getTransacaoFromListaDTO(listaDTO));

            lista.add(conta);
        }
        return lista;
    }

    public List<Transacao> getTransacaoFromListaDTO(List<DTO> listaDTO) {
        Transacao transacao = new Transacao();
        List<Transacao> lista = new ArrayList<>();

        for (int i = 0; i < listaDTO.size() ; i++) {
            transacao.setOperacao(listaDTO.get(i).getOperacaoTransacao());
            transacao.setId(listaDTO.get(i).getIdTransacao());
            transacao.setDataOperacao(listaDTO.get(i).getDataOperacaoTransacao());
            transacao.setValor(listaDTO.get(i).getValorTransacao());
            transacao.setCodigo(listaDTO.get(i).getCodigoTransacao());

            transacao.setPermitido(calculaTransacao(listaDTO.get(i).getSaldoConta(), listaDTO.get(i).getValorTransacao()));
            if (transacao.getPermitido() == true) {
                transacao.setResultados(getListaPermitidos(listaDTO, i));
            } else transacao.setResultados(getListaNegados(listaDTO, i));

            lista.add(transacao);
        }
        return lista;
    }

    private List<Resultado> getListaPermitidos(List<DTO> listaDTO, int i) {
        Resultado resultado = new Resultado();
        List<Resultado> lista = new ArrayList<>();

        resultado.getId(listaDTO.get(i).getIdTransacao());
        resultado.setDataHoraProcessamento(getDataEhora());
        resultado.setTransacoesPermitidas(getListaComPermitidas(listaDTO, i,resultado.getDataHoraProcessamento()));
        lista.add(resultado);

        return lista;
    }

    private List<Resultado> getListaNegados(List<DTO> listaDTO, int i) {
        Resultado resultado = new Resultado();
        List<Resultado> lista = new ArrayList<>();

        resultado.getId(listaDTO.get(i).getIdTransacao());
        resultado.setDataHoraProcessamento(getDataEhora());
        resultado.setTransacoesNegadas(getListaComNegadas(listaDTO, i, resultado.getDataHoraProcessamento()));
        lista.add(resultado);

        return lista;
    }


    private Boolean calculaTransacao(Double saldoConta, Double valorTransacao) {
        if (saldoConta < valorTransacao) {
            return false;
        } else return true;
    }

    private LocalDate getDataEhora() {
        LocalDate dataEhora = LocalDate.now();
        return dataEhora;
    }
    private List<Permissao> getListaComNegadas(List<DTO> listaDTO, int i, LocalDate dataEhora) {
        List<Permissao> lista = new ArrayList<>();
        Permissao permissao = new Permissao();

        permissao.setId(listaDTO.get(i).getIdTransacao() + 10);
        permissao.setDataOperacao(dataEhora);
        permissao.setValor(listaDTO.get(i).getValorTransacao());
        permissao.setPermitido("Negada");
        permissao.setCodigo(listaDTO.get(i).getCodigoTransacao() + "P");

        lista.add(permissao);
        return lista; //ok

    }
    public List<Permissao> getListaComPermitidas(List<DTO> listaDTO, int i, LocalDate dataEhora) {
        List<Permissao> lista = new ArrayList<>();
        Permissao permissao = new Permissao();

        permissao.setId(listaDTO.get(i).getIdTransacao() + 10);
        permissao.setDataOperacao(dataEhora);
        permissao.setValor(listaDTO.get(i).getValorTransacao());

        permissao.setPermitido("Permitido");
        permissao.setCodigo(listaDTO.get(i).getCodigoTransacao() + "P");

        lista.add(permissao);
        return lista; //ok
    }

}


