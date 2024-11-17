package com.jrlocacao.jr_projeto.controllers;
import com.jrlocacao.jr_projeto.models.PessoaJuridica;
import com.jrlocacao.jr_projeto.repositories.PessoaJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("/*")
@RequestMapping("/pessoajuridica")
public class PessoaJuridicaController {
    @Autowired
    private PessoaJuridicaRepository PFJuri;

    @GetMapping
    public ResponseEntity<List<PessoaJuridica>> listarPJ(){
        List<PessoaJuridica> list = (List<PessoaJuridica>) PFJuri.findAll();
        return ResponseEntity.status(200).body(list);
    }

    @PostMapping
    public ResponseEntity<PessoaJuridica> criarPJ(@RequestBody PessoaJuridica pj){
        PessoaJuridica newPj = PFJuri.save(pj);
        return ResponseEntity.status(201).body(newPj);
    }

    @PutMapping
    public ResponseEntity<PessoaJuridica> mudarPJ(@RequestBody PessoaJuridica pj){
        PessoaJuridica newPj = PFJuri.save(pj);
        return ResponseEntity.status(201).body(newPj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarPJ(@PathVariable Integer id){
        PFJuri.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
