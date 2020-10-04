package model;

public class Corrida extends AtivFisica {

	private Double met = 8.0; // Valor fixo da Atividade
	
	private String nomeAtividade = "Corrida"; // Nome da Atividade
	
	public Corrida() {}
	
	public String getNomeAtividade() {
		return nomeAtividade;
	}

	public Corrida(Double met, String nomeAtividade) {
		super();
		this.met = met;
		this.nomeAtividade = nomeAtividade;
	}

	public Double getMet() {
		return met;
	}

}
