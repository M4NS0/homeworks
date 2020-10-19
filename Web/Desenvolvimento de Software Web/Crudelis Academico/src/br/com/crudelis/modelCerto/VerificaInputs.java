package br.com.crudelis.modelCerto;

public class VerificaInputs {
	public boolean VerificaN1 (Double notaN1) {
		if ((notaN1 > 100) || (notaN1 < 0))  return false;
		else return true;

	}
	
	public boolean VerificaN2 (Double notaN2) {
		if ((notaN2 > 100) || (notaN2 < 0))  return false;
		else return true;

	}
	
	public boolean VerificaFrequencia (int presenca, int total) {
		if ((presenca > total) || (presenca < 0))  return false;
		else return true;

	}
}
