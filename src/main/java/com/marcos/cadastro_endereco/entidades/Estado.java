package com.marcos.cadastro_endereco.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "estado")
@Data
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "sigla_estado")
    private String siglaEstado;
    @Column(name = "nome_estado")
    private String nomeEstado;

    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List<Cidade> cidades;

}
