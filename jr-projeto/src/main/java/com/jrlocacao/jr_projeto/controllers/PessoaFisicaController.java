package com.jrlocacao.jr_projeto.controllers;

import com.jrlocacao.jr_projeto.models.PessoaFisica;
import com.jrlocacao.jr_projeto.repositories.PessoaFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/pessoafisica")
public class PessoaFisicaController {

    @Autowired
    private PessoaFisicaRepository PFRepo;

    @GetMapping
    public ResponseEntity<List<PessoaFisica>> listarPF(){
        List<PessoaFisica> list = (List<PessoaFisica>) PFRepo.findAll();
        return ResponseEntity.status(200).body(list);
    }

    @PostMapping
    public ResponseEntity<PessoaFisica> criarPF(@RequestBody PessoaFisica pf){
        PessoaFisica newpf = PFRepo.save(pf);
        return ResponseEntity.status(201).body(newpf);
    }

    @PutMapping
    public ResponseEntity<PessoaFisica> alterarPF(@RequestBody PessoaFisica pf){
        PessoaFisica newpf = PFRepo.save(pf);
        return ResponseEntity.status(200).body(newpf);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarPF(@RequestBody Integer id){
        PFRepo.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
