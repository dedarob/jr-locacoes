package com.jrlocacao.jr_projeto.controllers;


import com.jrlocacao.jr_projeto.models.Cargo;
import com.jrlocacao.jr_projeto.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/cargo")
public class CargoController {
    @Autowired
    CargoRepository cargoRepo;

    @GetMapping
    public ResponseEntity<List<Cargo>> listarCargo(){
        List<Cargo> list = (List<Cargo>) cargoRepo.findAll();
        return ResponseEntity.status(200).body(list);
    }

    @PostMapping
    public ResponseEntity<Cargo> criarCargo(@RequestBody Cargo cargo){
        Cargo newCargo = cargoRepo.save(cargo);
        return ResponseEntity.status(201).body(newCargo);
    }

    @PutMapping
    public ResponseEntity<Cargo> alterarCargo(@RequestBody Cargo cargo){
        Cargo newCargo = cargoRepo.save(cargo);
        return ResponseEntity.status(200).body(newCargo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarCargo(@PathVariable Integer id){
        cargoRepo.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
