package model;

/**
* Classe generica com atributos comuns de todas as atividades.
*/

public class AtivFisica {

	private Integer idAtividade;

	private Integer dataAtividade;

	private Double duracaoAtividade;

	private Double caloriasQueimadas;

	private Integer tipoAtividade;

	private Double distanciaAtividade;
	
	public AtivFisica() {}
	public AtivFisica(Integer idAtividade, Integer dataAtividade, Double duracaoAtividade, Double caloriasQueimadas,
			Integer tipoAtividade, Double distanciaAtividade) {
		super();
		this.idAtividade = idAtividade;
		this.dataAtividade = dataAtividade;
		this.duracaoAtividade = duracaoAtividade;
		this.caloriasQueimadas = caloriasQueimadas;
		this.tipoAtividade = tipoAtividade;
		this.distanciaAtividade = distanciaAtividade;
	}
	public Integer getIdAtividade() {
		return idAtividade;
	}
	public void setIdAtividade(Integer idAtividade) {
		this.idAtividade = idAtividade;
	}
	public Integer getDataAtividade() {
		return dataAtividade;
	}
	public void setDataAtividade(Integer dataAtividade) {
		this.dataAtividade = dataAtividade;
	}
	public Double getDuracaoAtividade() {
		return duracaoAtividade;
	}
	public void setDuracaoAtividade(Double duracaoAtividade) {
		this.duracaoAtividade = duracaoAtividade;
	}
	public Double getCaloriasQueimadas() {
		return caloriasQueimadas;
	}
	public void setCaloriasQueimadas(Double caloriasQueimadas) {
		this.caloriasQueimadas = caloriasQueimadas;
	}
	public Integer getTipoAtividade() {
		return tipoAtividade;
	}
	public void setTipoAtividade(Integer tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}
	public Double getDistanciaAtividade() {
		return distanciaAtividade;
	}
	public void setDistanciaAtividade(Double distanciaAtividade) {
		this.distanciaAtividade = distanciaAtividade;
	}
	
}
