package services;

import models.Agencia;
import models.Conta;
import models.DTO;

import java.util.ArrayList;
import java.util.List;

public class GetDadosAgencia {

    public List<Agencia> getDados(List<DTO> listaDTO) {
        Agencia agencia = new Agencia();
        GetDadosConta conta = new GetDadosConta();
        List<Conta> contas = new ArrayList<>();
        List<Agencia> agencias = new ArrayList<>();

        for (DTO dado:
             listaDTO) {
            agencia.setId(dado.getIdAgencia());
            agencia.setNome(dado.getNomeAgencia());
            agencia.setCodigo(dado.getCodigoAgencia());
            contas = conta.getDados(dado);
            agencia.setContas(contas);
            agencias.add(agencia);
        }
        return agencias;
    }
}
