package com.marcos.cadastro_endereco.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "cidade", schema = "public")
@Data
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_cidade")
    private String nomeCidade;

    @Column(name = "codigo_ibge")
    private String codigoIbge;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

    @OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL)
    private List<Bairro> bairros;

    @OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL)
    private List<Cep> ceps;

}
