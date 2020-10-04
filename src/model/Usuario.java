package model;

public class Usuario {

	private Integer idUsuario;

	private String nomeUsuario;
	
	public Double getPesoUsuario() {
		return pesoUsuario;
	}
	public void setPesoUsuario(Double pesoUsuario) {
		this.pesoUsuario = pesoUsuario;
	}
	private Double pesoUsuario;

	private String emailUsuario;

	private String senhaUsuario;

	private AtivFisica[] ativFisica;

	private Peso[] peso;

	public Usuario() {}
	
	public Usuario(Integer idUsuario, String nomeUsuario, Double pesoUsuario, String emailUsuario, String senhaUsuario,
			AtivFisica[] ativFisica, Peso[] peso) {
		super();
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.pesoUsuario = pesoUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
		this.ativFisica = ativFisica;
		this.peso = peso;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	public AtivFisica[] getAtivFisica() {
		return ativFisica;
	}
	public void setAtivFisica(AtivFisica[] ativFisica) {
		this.ativFisica = ativFisica;
	}
	public Peso[] getPeso() {
		return peso;
	}
	public void setPeso(Peso[] peso) {
		this.peso = peso;
	}
	
}
