package com.marcos.cadastro_endereco.controladores;

import com.marcos.cadastro_endereco.dto.LogradouroCepDTO;
import com.marcos.cadastro_endereco.servicos.LogradouroCepServico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("logradouro-cep")
public class LogradouroCepControlador {

    private final LogradouroCepServico logradouroCepServico;

    public LogradouroCepControlador(LogradouroCepServico logradouroCepServico) {
        this.logradouroCepServico = logradouroCepServico;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrarCepLogradouro(@RequestBody LogradouroCepDTO logradouroCepDTO){
        logradouroCepServico.cadastrarLogradouroCep(logradouroCepDTO);
        return ResponseEntity.ok("Logradouro e Cep vinculados");
    }
}
