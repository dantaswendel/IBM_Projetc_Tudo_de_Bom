package br.com.ibm.tudodebom.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity // mostra que a classe está relacionada a uma tabela banco de dados
@Table(name = "clientes")
public class Cliente {

	@Id
	@Basic(optional = false)
	@Size(min = 11, max = 11)
	private String cpf;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private boolean primeiracompra;

	public Cliente() {

	}

	public Cliente(@Size(min = 11, max = 11) @Pattern(regexp = "(\\d{11})") String cpf, String nome, String endereco,
			String telefone, String email) {
		super();

		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

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



	public boolean isPrimeiracompra() {
		return primeiracompra;
	}

	public void setPrimeiracompra(boolean primeiracompra) {
		this.primeiracompra = primeiracompra;
	}

}
