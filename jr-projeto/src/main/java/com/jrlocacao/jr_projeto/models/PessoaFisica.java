package com.jrlocacao.jr_projeto.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pessoasfisicas")
public class PessoaFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDpf")
    private Integer id;
    @Column(name = "CodPF")
    private Integer codPessoaFisica;
    @Column(name = "Nome")
    private String name;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "Identidade")
    private String identidade;
    @Column(name = "Endereco")
    private String endereco;
    @Column(name = "Email")
    private String email;
}
