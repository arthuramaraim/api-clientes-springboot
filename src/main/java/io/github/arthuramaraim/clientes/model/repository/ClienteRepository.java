package io.github.arthuramaraim.clientes.model.repository;


import io.github.arthuramaraim.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}
