package br.com.ibm.tudodebom.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity  // mostra que a classe está relacionada a uma tabela banco de dados
@Table (name = "clientes")
public class Cliente {
	

	
		
		@Id
		@Column(unique=true)
		@Size(min=11, max=11)
		@Pattern(regexp = "(\\d{11})")
		private String cpf;
		private String nome;
		private String endereco;
		private String telefone;
		private String email;
		private LocalDate nascimento ;
		private boolean primeiracompra;
		
		
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


		public LocalDate getNascimento() {
			return nascimento;
		}


		public void setNascimento(LocalDate date) {
			this.nascimento = date;
		}


		public boolean isPrimeiracompra() {
			return primeiracompra;
		}


		public void setPrimeiracompra(boolean primeiracompra) {
			this.primeiracompra = primeiracompra;
		}
				
		}


		

