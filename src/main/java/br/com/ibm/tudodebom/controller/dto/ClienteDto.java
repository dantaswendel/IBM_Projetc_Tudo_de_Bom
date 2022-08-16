package br.com.ibm.tudodebom.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.ibm.tudodebom.model.Cliente;

public class ClienteDto {

	private String cpf;
	private String nome;
	private String telefone;
	private String email;

	public ClienteDto(Cliente cliente) {
		this.cpf = cliente.getCpf();
		this.nome = cliente.getNome();
		this.telefone = cliente.getTelefone();
		this.email = cliente.getEmail();
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}
	
	public static List<ClienteDto> converter(List<Cliente> cliente){
		return cliente.stream().map(ClienteDto::new).collect(Collectors.toList());
	}
}
