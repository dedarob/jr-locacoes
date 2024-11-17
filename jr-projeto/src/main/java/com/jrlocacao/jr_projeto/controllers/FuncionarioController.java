package com.jrlocacao.jr_projeto.controllers;

import com.jrlocacao.jr_projeto.models.Funcionario;
import com.jrlocacao.jr_projeto.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/funcionario")
public class FuncionarioController {
    @Autowired
    FuncionarioRepository funcRepo;

    @GetMapping
    public ResponseEntity<List<Funcionario>> criarFuncionario(){
        List<Funcionario> list = (List<Funcionario>) funcRepo.findAll();
        return ResponseEntity.status(200).body(list);
    }

    @PostMapping
    public ResponseEntity<Funcionario> criarFuncionario(@RequestBody Funcionario funcionario){
        Funcionario newFuncionario = funcRepo.save(funcionario);
        return ResponseEntity.status(201).body(newFuncionario);
    }

    @PutMapping
    public ResponseEntity<Funcionario> mudarFuncionario(@RequestBody Funcionario funcionario){
        Funcionario newFuncionario = funcRepo.save(funcionario);
        return ResponseEntity.status(200).body(newFuncionario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarFuncionario(@PathVariable Integer id){
        funcRepo.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
