package services;

import models.DTO;
import models.Resultado;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class GetResultadosTransacao {

    public List<Resultado> getListaResultado(DTO dado, Boolean permitido) {
        Resultado resultado = new Resultado();
        GetListaPermissao permissao = new GetListaPermissao();
        List<Resultado> resultados = new ArrayList<>();

        resultado.getId(dado.getIdTransacao() + 100);
        resultado.setDataHoraProcessamento(getDataEhora());

        if (permitido == true ) {
            resultado.setTransacoesPermitidas(permissao.getListaDePermitidos(dado, true, getDataEhora()));
        } else resultado.setTransacoesNegadas(permissao.getListaDePermitidos(dado, false, getDataEhora()));

        resultados.add(resultado);
        return resultados;
    }



    private LocalDate getDataEhora() {
        LocalDate dataEhora = LocalDate.now();
        return dataEhora;

    }
}
