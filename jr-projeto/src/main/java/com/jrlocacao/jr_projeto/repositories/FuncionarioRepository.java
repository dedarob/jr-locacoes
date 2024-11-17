package com.jrlocacao.jr_projeto.repositories;

import com.jrlocacao.jr_projeto.models.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {
}
