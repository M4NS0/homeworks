package br.com.crudelis.modelCerto;

public class Materia extends Rendimento {
	String nomeMateria;
	int idMateria;
	int cargaHoraria;

	public Materia(String nomeMateria, int idMateria, int cargaHoraria) {
		super();
		this.nomeMateria = nomeMateria;
		this.idMateria = idMateria;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNomeMateria() {
		return nomeMateria;
	}

	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}

	public int getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
