package com.marcos.cadastro_endereco.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "logradouro")
@Data
public class Logradouro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_logradouro", nullable = false)
    private String nomeLogradouro;

    @ManyToOne
    @JoinColumn(name = "id_bairro")
    private Bairro bairro;

    @OneToMany(mappedBy = "logradouro", cascade = CascadeType.ALL)
    private List<Endereco> enderecos;

    @OneToMany(mappedBy = "logradouro", cascade = CascadeType.ALL)
    private List<LogradouroCep> logradouroCeps;
}
