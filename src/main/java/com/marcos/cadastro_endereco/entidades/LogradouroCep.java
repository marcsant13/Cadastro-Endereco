package com.marcos.cadastro_endereco.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "logradouro_cep", schema = "public")
@Data
public class LogradouroCep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_logradouro")
    private Logradouro logradouro;

    @ManyToOne
    @JoinColumn(name = "id_cep")
    private Cep cep;

}
