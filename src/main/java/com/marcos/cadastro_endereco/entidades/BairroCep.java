package com.marcos.cadastro_endereco.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "bairro_cep", schema = "public")
@Data
public class BairroCep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_bairro")
    private Bairro bairro;

    @ManyToOne
    @JoinColumn(name = "id_cep")
    private Cep cep;

}
