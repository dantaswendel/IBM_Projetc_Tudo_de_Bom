package br.com.ibm.tudodebom.controller.form;

import java.time.LocalDate;

import br.com.ibm.tudodebom.model.Cliente;


public class ClienteForm {
	
	private String cpf;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public br.com.ibm.tudodebom.model.Cliente converter(Cliente cliente) {
		
		return new br.com.ibm.tudodebom.model.Cliente(cpf,nome,endereco,telefone, email);
	}

	
	
	
}
