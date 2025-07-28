package com.marcos.cadastro_endereco.dto;

import lombok.Data;

@Data
public class EnderecoDTO {
    private Integer idPessoa;
    private Integer idLogradouro;
    private String numeroEndereco;
    private String complemento;
}
