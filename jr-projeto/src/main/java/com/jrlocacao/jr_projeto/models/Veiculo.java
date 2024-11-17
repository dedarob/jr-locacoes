package com.jrlocacao.jr_projeto.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "veiculos")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDveiculos")
    private Integer id;
    @Column(name = "TiposVeiculosIDTipo")
    private Integer idTipoVeiculo;
    @Column(name = "CodVeiculo")
    private Integer codVeiculo;
    @Column(name = "Marca")
    private Integer marca;
    @Column(name = "Modelo")
    private Integer modelo;
    @Column(name = "AnoFabricacao")
    private String anoFabricao;
    @Column(name = "AluguelIDaluguel")
    private Integer idAluguel;
}
