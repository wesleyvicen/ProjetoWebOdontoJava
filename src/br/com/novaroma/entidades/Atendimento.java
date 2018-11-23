package br.com.novaroma.entidades;

public class Atendimento {
	private int numAten;
	private String nome;
	private String cpfPaciente;
	private String descricao;
	private boolean status;
	private int id;
	
	private int info;
	
	public Atendimento() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumAten() {
		return numAten;
	}
	public void setNumAten(int numAten) {
		this.numAten = numAten;
	}
	public String getCpfPaciente() {
		return cpfPaciente;
	}
	public void setCpfPaciente(String cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Atendimento [numAten=" + numAten + ", nome=" + nome + ", cpfPaciente=" + cpfPaciente + ", descricao="
				+ descricao + ", status=" + status + ", id=" + id + "]";
	}
	
}
