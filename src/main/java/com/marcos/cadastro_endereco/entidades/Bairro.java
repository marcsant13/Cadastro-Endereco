package com.marcos.cadastro_endereco.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "bairro", schema = "public")
@Data
public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_bairro", nullable = false)
    private String nomeBairro;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    @OneToMany(mappedBy = "bairro", cascade = CascadeType.ALL)
    private List<Logradouro> logradouros;

    @OneToMany(mappedBy = "bairro", cascade = CascadeType.ALL)
    private List<BairroCep> bairroCeps;
}
