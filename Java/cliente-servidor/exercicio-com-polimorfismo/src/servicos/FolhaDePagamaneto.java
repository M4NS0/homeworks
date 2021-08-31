package servicos;

import interfaces.Funcionario;

public class FolhaDePagamaneto {
    public void calcularGratificacao(Funcionario funcionario) {
        funcionario.CalculaGratificacao();
    }
    public void calcularSalarioTotal(Funcionario funcionario) {
        funcionario.CalculaSalarioTotal();
    }
}
