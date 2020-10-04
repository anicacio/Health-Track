package model;

public class Ciclismo extends AtivFisica {

	private Double met = 4.0; // Valor fixo da Atividade
	
	private String nomeAtividade = "Ciclismo"; // Nome da Atividade
	
	public Ciclismo() {}
	
	public String getNomeAtividade() {
		return nomeAtividade;
	}

	public Ciclismo(Double met, String nomeAtividade) {
		super();
		this.met = met;
		this.nomeAtividade = nomeAtividade;
	}

	public Double getMet() {
		return met;
	}

}
