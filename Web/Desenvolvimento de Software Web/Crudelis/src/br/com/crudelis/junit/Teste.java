package br.com.crudelis.junit;

import static org.junit.Assert.*;
import org.junit.Test;

import br.com.crudelis.model.ModificaStatus;

public class Teste {
	ModificaStatus teste = new ModificaStatus();

	@Test
	public void AprovadoPorNotaeFrequencia() {
		assertEquals("Aprovado por Nota e Presenças", teste.CalculaNota(100.0d, 100.0d, 80, 80));
	}

	@Test
	public void AprovadoPorNotaeFrequencia2() {
		assertEquals("Aprovado por Nota e Presenças", teste.CalculaNota(0.0d, 0.0d, 0, 0));
	}

	@Test
	public void PresencasInsuficientes() {
		assertEquals("Tem presenças suficientes mas foi repovado por nota", teste.CalculaNota(100.0d, 0.0d, 100, 100));
	}

	@Test
	public void PresencasInsuficientes2() {
		assertEquals("Tem presenças suficientes mas foi repovado por nota",teste.CalculaNota(100.0d, 100.0d, 100, 100));
	}

	@Test
	public void ReprovadoPorFrequencia() {
		assertEquals("Aprovado por Nota porém reprovado por frequência", teste.CalculaNota(100.0d, 100.0d, 0, 100));
	}

	@Test
	public void ReprovadoPorFrequencia2() {
		assertEquals("Aprovado por Nota porém reprovado por frequência", teste.CalculaNota(100.0d, 100.0d, 100, 100));
	}

	@Test
	public void ReprovadoPorFrequenciaeNota() {
		assertEquals("Reprovado por nota e por frequência", teste.CalculaNota(100.0d, 0.0d, 0, 100));
	}

	@Test
	public void ReprovadoPorFrequenciaeNota2() {
		assertEquals("Reprovado por nota e por frequência", teste.CalculaNota(100.0d, 100.0d, 100, 100));
	}

}
