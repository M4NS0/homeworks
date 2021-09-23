package services;

import models.DTO;
import models.Permissao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GetListaPermissao {
    public List<Permissao> getListaDePermitidos(DTO dado, Boolean permitido, LocalDate dataEhora) {
        List<Permissao> permissoes = new ArrayList<>();
        Permissao permissao = new Permissao();

        if (permitido == true) {
            permissao.setPermitido("Permitido");
        } else  permissao.setPermitido("Não Permitido");

        permissao.setId(dado.getIdTransacao() + 100);
        permissao.setCodigo(dado.getCodigoTransacao() + "P");
        permissao.setDataOperacao(dataEhora);
        permissao.setValor(dado.getValorTransacao());

        permissoes.add(permissao);

        return permissoes;

    }
}
