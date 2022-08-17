package br.com.ibm.tudodebom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.ibm.tudodebom.model.Cliente;
import br.com.ibm.tudodebom.model.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

	public static List<Transacao> getByCliente(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
