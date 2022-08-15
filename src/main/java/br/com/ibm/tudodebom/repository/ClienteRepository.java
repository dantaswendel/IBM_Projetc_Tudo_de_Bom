package br.com.ibm.tudodebom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ibm.tudodebom.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
 
}
