package model;

public class Peso {

	private Integer idPeso;

	private Integer dataPeso;

	private Double peso;

	public Peso() {}
	public Peso(Integer idPeso, Integer dataPeso, Double peso) {
		super();
		this.idPeso = idPeso;
		this.dataPeso = dataPeso;
		this.peso = peso;
	}

	public Integer getIdPeso() {
		return idPeso;
	}

	public void setIdPeso(Integer idPeso) {
		this.idPeso = idPeso;
	}

	public Integer getDataPeso() {
		return dataPeso;
	}

	public void setDataPeso(Integer dataPeso) {
		this.dataPeso = dataPeso;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

}
