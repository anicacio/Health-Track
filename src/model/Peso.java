package model;

public class Peso {
	private Integer idPeso;
	private String dataPeso;
	private Double peso;

	public Peso() {
		super();
	}
	public Peso(Integer idPeso, String dataPeso, Double peso) {
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
	public String getDataPeso() {
		return dataPeso;
	}
	public void setDataPeso(String dataPeso) {
		this.dataPeso = dataPeso;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Peso [idPeso=" + idPeso + ", dataPeso=" + dataPeso + ", peso=" + peso + "]";
	}

}
