package backEnd;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private String processo;
	private float honorariosIniciais;
	private float porcentagemExito;
	private float possivelExito;
	private Date dataInicial;
	private Date dataHoje;
	private Date dataFinalPrevista;

	public Pessoa() {
	}
	public Pessoa(String nome, 
			String telefone, 
			String processo, 
			float honorariosIniciais, 
			float porcentagemExito, 
			float possivelExito, 
			Date dataInicial, 
			Date dataHoje, 
			Date dataFinalPrevista) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.processo = processo;
		this.honorariosIniciais = honorariosIniciais;
		this.porcentagemExito = porcentagemExito;
		this.possivelExito = possivelExito;
		this.dataInicial = dataInicial;
		this.dataHoje = dataHoje;
		this.dataFinalPrevista = dataFinalPrevista;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getProcesso() {
		return processo;
	}
	public void setProcesso(String processo) {
		this.processo = processo;
	}
	public float getHonorariosIniciais() {
		return honorariosIniciais;
	}
	public void setHonorariosIniciais(float honorariosIniciais) {
		this.honorariosIniciais = honorariosIniciais;
	}
	public float getPorcentagemExito() {
		return porcentagemExito;
	}
	public void setPorcentagemExito(float porcentagemExito) {
		this.porcentagemExito = porcentagemExito;
	}
	public float getPossivelExito() {
		return possivelExito;
	}
	public void setPossivelExito(float possivelExito) {
		this.possivelExito = possivelExito;
	}
	public Date getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}
	public Date getDataHoje() {
		return dataHoje;
	}
	public void setDataHoje(Date dataHoje) {
		this.dataHoje = dataHoje;
	}
	public Date getDataFinalPrevista() {
		return dataFinalPrevista;
	}
	public void setDataFinalPrevista(Date dataFinalPrevista) {
		this.dataFinalPrevista = dataFinalPrevista;
	}
	@Override
	public String toString() {
		return nome + "-"  + processo;
	}
	
	
}
