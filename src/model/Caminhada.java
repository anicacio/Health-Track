package model;


/**
* Classe Caminhada que contem atributos especifico desse tipo de atividade
*/

public class Caminhada extends AtivFisica {

	private Double met = 2.3; // Valor fixo para caminhada
	
	private String nomeAtividade = "Caminhada"; // Nome da Atividade
	
	public Caminhada() {}
	
	public String getNomeAtividade() {
		return nomeAtividade;
	}

	public Caminhada(Double met, String nomeAtividade) {
		super();
		this.met = met;
		this.nomeAtividade = nomeAtividade;
	}

	public Double getMet() {
		return met;
	}
	
}
