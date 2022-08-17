package br.com.ibm.tudodebom.model;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity  // mostra que a classe está relacionada a uma tabela banco de dados
@Table (name = "transacao")
public class Transacao {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	  @ManyToOne
	   @JoinColumn(name="id_produto", nullable=false)
	   private Produto produto;
	  
	  @ManyToOne
	   @JoinColumn(name="id_cliente", nullable=false)
	   private Cliente cliente;

	  
	  public Transacao( Produto produto, Cliente cliente) {
		  this.produto=produto;
		  this.cliente=cliente;
	  }
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	  

	

	
}