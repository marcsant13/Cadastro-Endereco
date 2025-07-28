package com.marcos.cadastro_endereco.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "endereco")
@Data
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numero_endereco")
    private String numeroEndereco;

    @Column(nullable = true)
    private String complemento;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "id_logradouro")
    private Logradouro logradouro;

}
