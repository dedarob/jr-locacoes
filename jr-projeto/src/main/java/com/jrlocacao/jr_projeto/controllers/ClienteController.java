package com.jrlocacao.jr_projeto.controllers;

import com.jrlocacao.jr_projeto.models.Cliente;
import com.jrlocacao.jr_projeto.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository cliRepo;

    @GetMapping
    public ResponseEntity<List<Cliente>> listarCliente(){
        List<Cliente> list = (List<Cliente>) cliRepo.findAll();
        return ResponseEntity.status(200).body(list);
    }

    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente cliente){
        Cliente newCliente = cliRepo.save(cliente);
        return ResponseEntity.status(201).body(newCliente);
    }

    @PutMapping
    public ResponseEntity<Cliente> mudarCliente(@RequestBody Cliente cliente){
        Cliente newCliente = cliRepo.save(cliente);
        return ResponseEntity.status(200).body(newCliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> deletarCliente(@PathVariable Integer id){
        cliRepo.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
