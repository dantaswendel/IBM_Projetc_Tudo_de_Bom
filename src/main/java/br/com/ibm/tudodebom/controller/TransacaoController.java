package br.com.ibm.tudodebom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ibm.tudodebom.model.Cliente;
import br.com.ibm.tudodebom.model.Transacao;
import br.com.ibm.tudodebom.repository.TransacaoRepository;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {
	
	@Autowired
	TransacaoRepository transacaoRepository;
	
	@GetMapping
	public List<Transacao> listar(){
		return transacaoRepository.findAll();
	}
	
	@PostMapping
	public void salvar( @RequestBody Transacao transacao) {
		if(transacao.getId()>0)
			transacaoRepository.save(transacao);
	} 
}
