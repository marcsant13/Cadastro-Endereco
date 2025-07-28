package com.marcos.cadastro_endereco.controladores;

import com.marcos.cadastro_endereco.dto.EnderecoDTO;
import com.marcos.cadastro_endereco.servicos.EnderecoServico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
public class ControladorEndereco {

    private final EnderecoServico enderecoServico;

    public ControladorEndereco(EnderecoServico enderecoServico) {
        this.enderecoServico = enderecoServico;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrarEndereco(@RequestBody EnderecoDTO enderecoDTO){
        enderecoServico.cadastrarEndereco(enderecoDTO);
        return ResponseEntity.ok("Endereco salvo");
    }
}
