package com.jrlocacao.jr_projeto.controllers;

import com.jrlocacao.jr_projeto.models.Aluguel;
import com.jrlocacao.jr_projeto.repositories.AluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/aluguel")
public class AluguelController {
    @Autowired
    private AluguelRepository algRepo;

    @GetMapping
    public ResponseEntity<List<Aluguel>> aluguelLista() {
        List<Aluguel>  list =   (List<Aluguel>) algRepo.findAll();
        return ResponseEntity.status(200).body(list);
    }

    @PostMapping
    public ResponseEntity<Aluguel> criarAluguel(@RequestBody Aluguel aluguel){
            Aluguel newAluguel = algRepo.save(aluguel);
            return ResponseEntity.status(201).body(newAluguel);
    }

    @PutMapping
    public ResponseEntity<Aluguel> mudarAluguel(@RequestBody Aluguel aluguel){
        Aluguel newAluguel = algRepo.save(aluguel);
        return ResponseEntity.status(200).body(newAluguel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAluguel(@PathVariable Integer id){
        algRepo.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
