package model;

public class Natacao extends AtivFisica {

	private Double met = 6.0; // Valor fixo da Atividade
	
	private String nomeAtividade = "Natacao"; // Nome da Atividade
	
	public Natacao() {}
	
	public String getNomeAtividade() {
		return nomeAtividade;
	}

	public Natacao(Double met, String nomeAtividade) {
		super();
		this.met = met;
		this.nomeAtividade = nomeAtividade;
	}

	public Double getMet() {
		return met;
	}

}
