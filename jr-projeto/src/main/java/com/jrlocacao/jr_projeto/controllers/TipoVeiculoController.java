package com.jrlocacao.jr_projeto.controllers;

import com.jrlocacao.jr_projeto.models.TipoVeiculo;
import com.jrlocacao.jr_projeto.repositories.TipoVeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/tipoveiculo")
public class TipoVeiculoController {
    @Autowired
    private TipoVeiculoRepository TipoVeiculoRepo;

    @GetMapping
    public ResponseEntity<List<TipoVeiculo>> listarTipoVeiculo(){
        List<TipoVeiculo> list = (List<TipoVeiculo>) TipoVeiculoRepo.findAll();
        return ResponseEntity.status(200).body(list);
    }

    @PostMapping
    public ResponseEntity<TipoVeiculo> criarTipoVeiculo(@RequestBody TipoVeiculo tpVeic){
        TipoVeiculo tipoVeiculoNew = TipoVeiculoRepo.save(tpVeic);
        return ResponseEntity.status(201).body(tipoVeiculoNew);
    }

    @PutMapping
    public ResponseEntity<TipoVeiculo> mudarTipoVeiculo(@RequestBody TipoVeiculo tpVeic){
        TipoVeiculo tipoVeiculoNew = TipoVeiculoRepo.save(tpVeic);
        return ResponseEntity.status(200).body(tipoVeiculoNew);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarTipoVeiculo(@PathVariable Integer id){
        TipoVeiculoRepo.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
