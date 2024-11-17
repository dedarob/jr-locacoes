package com.jrlocacao.jr_projeto.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pessoasjuridicas")
public class PessoaJuridica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDpj")
    private Integer id;
    @Column(name = "CodPJ")
    private Integer codPJ;
    @Column(name = "RazaoSocial")
    private String razaoSocial;
    @Column(name = "NomeFantasia")
    private String nomeFantasia;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "InscricaoEstadual")
    private String inscricaoEstadual;
    @Column(name = "Endereco")
    private String endereco;
    @Column(name = "Email")
    private String email;
}
