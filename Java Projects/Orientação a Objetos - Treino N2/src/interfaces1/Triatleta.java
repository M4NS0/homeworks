package interfaces1;

public class Triatleta extends Pessoa implements Nadadores,Corredores,Ciclistas {
	

	public Triatleta() {
		//this.nome = nome;
	}
	
	public void correrDeBicicleta() {
		System.out.println(this.nome + " Está correndo de bicicleta");
	}
	public void correr() {
		System.out.println(this.nome + " Está correndo");
	}
	public void nadar() {
		System.out.println(this.nome + " Está nadando");
	}
	public void alongar() {
		System.out.println(this.nome + " Está alongando");
	}
	public void aquecer() {
		System.out.println(this.nome + " Está Aquecendo");
	}
	public void competir() {
		System.out.println(this.nome + " Está competindo");
	}
}