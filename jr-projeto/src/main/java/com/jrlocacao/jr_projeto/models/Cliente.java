package com.jrlocacao.jr_projeto.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "IDcliente")
    private Integer id;
    @Column(name = "CodCliente")
    private Integer codCliente;
    @Column(name = "PessoasJuridicasIDpj")
    private Integer pessoasJuridicasId;
    @Column(name = "PessoasFisicasIDpf")
    private Integer pessoasFisicasId;
}
