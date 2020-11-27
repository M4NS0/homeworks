package br.com.crudelis.model;

public class ModificaStatus {
	public String CalculaNota(Double notaN1, Double notaN2, int presencas, int cargaHoraria) {

		Double media = (notaN1 * (0.4) + notaN2 * (0.6));
		int minCarga = (int) (cargaHoraria * (0.75));
		
		
		if ((60 <= media) && (minCarga <= presencas)) {
			return "Aprovado por Nota e Presenças";
		}

		if ((media < 60) && (minCarga < presencas)) {
			return "Tem presenças suficientes mas foi repovado por nota";
		}

		if ((media >= 60) && (minCarga > presencas)) {
			return "Aprovado por Nota porém reprovado por frequência";
		}
		
		if ((media < 60) && (minCarga > presencas)) {
			return "Reprovado por nota e por frequência";
		}

		return null;

	}
}
