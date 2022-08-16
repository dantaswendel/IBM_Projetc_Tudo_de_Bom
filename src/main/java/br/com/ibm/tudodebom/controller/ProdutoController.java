package br.com.ibm.tudodebom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ibm.tudodebom.model.Produto;
import br.com.ibm.tudodebom.repository.ProdutoRepository;

@RestController
@RequestMapping("/cliente")
public final class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
public List<Produto> listar(){
	return produtoRepository.findAll();
}
	@PostMapping
	public void salvar( @RequestBody Produto produto) {
		if(produto.getId() >0)
			produtoRepository.save(produto);
	}
	
	@PutMapping
	public void alterar(@RequestBody Produto produto) {
		if(produto.getId()>0)
			produtoRepository.save(produto);
	}
	 
	@DeleteMapping
	public void excluir( Produto produto) {
		produtoRepository.delete(produto);
	}
}

	

