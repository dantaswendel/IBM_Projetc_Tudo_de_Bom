package br.com.ibm.tudodebom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ibm.tudodebom.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	
}
