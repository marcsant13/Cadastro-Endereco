package com.marcos.cadastro_endereco.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "cep", schema = "public")
@Data
public class Cep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "numero_cep")
    private String numeroCep;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    @OneToMany(mappedBy = "cep", cascade = CascadeType.ALL)
    private List<LogradouroCep> logradouroCeps;

    @OneToMany(mappedBy = "cep", cascade = CascadeType.ALL)
    private List<BairroCep> bairroCeps;

}
