package io.github.arthuramaraim.clientes.model.repository;

import io.github.arthuramaraim.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
