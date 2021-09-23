package services;

import models.Agencia;
import models.Conta;
import models.DTO;

import java.util.ArrayList;
import java.util.List;

public class LerAgencia {

    public Agencia getDados(List<DTO> listaDTO) {
        Agencia agencia = new Agencia();
        LerConta conta = new LerConta();
        List<Conta> contas = new ArrayList<>();

        for (DTO dado:
             listaDTO) {
            agencia.setId(dado.getIdAgencia());
            agencia.setNome(dado.getNomeAgencia());
            agencia.setCodigo(dado.getCodigoAgencia());
            contas = conta.getDados(dado);
            agencia.setContas(contas);
        }
        return agencia;
    }
}
