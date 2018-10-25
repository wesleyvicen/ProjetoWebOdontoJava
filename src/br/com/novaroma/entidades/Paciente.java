package br.com.novaroma.entidades;

public class Paciente {
	private String nome;
	private String cpf;
	private String endereco;
	private String numero;
	private String bairro;
	private String cep;
	private String uf;
	private String cidade;
	private String distrito;

	public Paciente() {

	}

	public Paciente(String nome, String cpf, String endereco, String numero, String bairro, String cep, String uf,
			String cidade, String distrito) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.uf = uf;
		this.cidade = cidade;
		this.distrito = distrito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

}
