package com.jrlocacao.jr_projeto.repositories;

import com.jrlocacao.jr_projeto.models.Aluguel;
import org.springframework.data.repository.CrudRepository;

public interface AluguelRepository extends CrudRepository<Aluguel, Integer> {
}
