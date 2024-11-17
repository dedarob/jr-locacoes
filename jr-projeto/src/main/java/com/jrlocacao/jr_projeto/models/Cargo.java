package com.jrlocacao.jr_projeto.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cargos")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDcargo")
    private Integer id;
    @Column(name = "CodCargo")
    private Integer CodCargo;
    @Column(name = "NomeCargo")
    private String nomeCargo;
    @Column(name = "DescricaoCargo")
    private String descCargo;
}
