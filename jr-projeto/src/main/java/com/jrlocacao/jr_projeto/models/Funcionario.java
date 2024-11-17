package com.jrlocacao.jr_projeto.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDfuncionario")
    private Integer id;
    @Column(name = "PessoasFisicasIDpf")
    private Integer idPessoaFisica;
    @Column(name = "CargosIDcargo")
    private Integer idCargo;
    @Column(name = "Matricula")
    private Integer matricula;
    @Column(name = "DataContratacao")
    private Date dtContratacao;
    @Column(name = "DataDemissao")
    private Date dtDemissao;
}
