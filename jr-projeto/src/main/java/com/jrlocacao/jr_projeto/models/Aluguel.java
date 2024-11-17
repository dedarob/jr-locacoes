    package com.jrlocacao.jr_projeto.models;

    import jakarta.persistence.*;
    import lombok.Generated;
    import lombok.Getter;
    import lombok.Setter;

    import java.math.BigDecimal;
    import java.util.Date;

    @Getter
    @Setter
    @Entity
    @Table(name = "aluguel")
    public class Aluguel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column (name = "IDaluguel")
        private Integer id;
        @Column (name = "ClientesIDcliente")
        private Integer idCliente;
        @Column (name = "VeiculosIDveiculos")
        private Integer idVeiculos;
        @Column (name = "CodContrato")
        private Integer codContrato;
        @Column (name = "DataInicio")
        private Date dtInicio;
        @Column (name = "DataFim")
        private Date dtFim;
        @Column (name = "ValorDiaria")
        private BigDecimal vlrDiaria;
        @Column (name = "ValorTotal")
        private BigDecimal vlrTotal;
    }
