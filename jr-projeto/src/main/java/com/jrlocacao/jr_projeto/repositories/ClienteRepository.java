package com.jrlocacao.jr_projeto.repositories;

import com.jrlocacao.jr_projeto.models.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
}
