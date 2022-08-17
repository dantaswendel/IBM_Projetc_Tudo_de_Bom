package br.com.ibm.tudodebom.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity  // mostra que a classe está relacionada a uma tabela banco de dados
@Table (name = "produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String marca;
	private float preco;
	private LocalDate validade;
	private boolean remedio;
	private boolean generico;
	
	@OneToMany
    @JoinColumn(name = "produto") // Esta coluna está na tabela "aluno".
    private List<Produto> produto;
	
	public LocalDate getvalidade() {
		return validade;
	}
	public void setvalidade(LocalDate validade) {
		this.validade = validade;
	}
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPreco() {
	if (generico==true) {
		preco=(float) (preco*0.8);
	return preco;
	}
	else 
	return preco;
	}
	
	public void setPreco(float preco) {
		if (generico==true) {
			preco=(float) (preco*0.8);
		this.preco = preco;
		}
		else 
		this.preco=preco;
	}
	
	public boolean isRemedio() {
		return remedio;
	}
	public void setRemedio(boolean remedio) {
		this.remedio = remedio;
	}
	public boolean isGenerico() {
		return generico;
	}
	public void setGenerico(boolean generico) {
		this.generico = generico;
	}
}

