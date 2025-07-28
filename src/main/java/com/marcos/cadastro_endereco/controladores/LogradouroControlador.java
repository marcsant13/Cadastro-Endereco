package com.marcos.cadastro_endereco.controladores;

import com.marcos.cadastro_endereco.dto.LogradouroDTO;
import com.marcos.cadastro_endereco.entidades.Logradouro;
import com.marcos.cadastro_endereco.servicos.LogradouroServico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logradouro")
public class LogradouroControlador {

    private final LogradouroServico logradouroServico;

    public LogradouroControlador(LogradouroServico logradouroServico) {
        this.logradouroServico = logradouroServico;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrarLogradouro(@RequestBody LogradouroDTO logradouroDTO){
        logradouroServico.cadastrarLogradouro(logradouroDTO);
        return ResponseEntity.ok("Logradouro salvo");
    }
}
