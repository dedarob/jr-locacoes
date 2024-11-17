package com.jrlocacao.jr_projeto.controllers;

import com.jrlocacao.jr_projeto.models.Veiculo;
import com.jrlocacao.jr_projeto.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiRepo;

    @GetMapping
    public ResponseEntity<List<Veiculo>> listarVeiculo(){
        List<Veiculo> list = (List<Veiculo>) veiRepo.findAll();
        return ResponseEntity.status(200).body(list);
    }

    @PostMapping
    public ResponseEntity<Veiculo> criarVeiculo(@RequestBody Veiculo veiculo){
        Veiculo newVeiculo = veiRepo.save(veiculo);
        return ResponseEntity.status(201).body(newVeiculo);
    }

    @PutMapping
    public ResponseEntity<Veiculo> mudarVeiculo(@RequestBody Veiculo veiculo){
        Veiculo newVeiculo = veiRepo.save(veiculo);
        return ResponseEntity.status(200).body(newVeiculo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarVeiculo(@PathVariable Integer id){
        veiRepo.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
