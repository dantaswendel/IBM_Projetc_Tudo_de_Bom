package br.com.ibm.tudodebom.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ibm.tudodebom.controller.form.ClienteForm;
import br.com.ibm.tudodebom.model.Cliente;
import br.com.ibm.tudodebom.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public final class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
public List<Cliente> listar(){
	return clienteRepository.findAll();
}
	@PostMapping
	public void salvar( @RequestBody Cliente cliente) {
		if(cliente.getCpf() != null)
			clienteRepository.save(cliente);
	}
	
	@PutMapping
	public void alterar(@RequestBody Cliente cliente) {
		if(cliente.getCpf() != null)
			clienteRepository.save(cliente);
	}
	 
	@DeleteMapping
	public void excluir( Cliente cliente) {
		clienteRepository.deleteAll();
	}
}

	

