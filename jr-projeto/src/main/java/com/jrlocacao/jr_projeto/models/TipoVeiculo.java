package com.jrlocacao.jr_projeto.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "tiposveiculos")
public class TipoVeiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDtipo")
    private Integer id;
    @Column(name = "CodTipo")
    private Integer codTipo;
    @Column(name = "Tipo")
    private String nomeTipo;
    @Column(name = "ValorDiaria")
    private BigDecimal vlrDiaria;
}
