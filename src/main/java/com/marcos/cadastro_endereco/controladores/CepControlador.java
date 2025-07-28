package com.marcos.cadastro_endereco.controladores;

import com.marcos.cadastro_endereco.dto.CepDTO;
import com.marcos.cadastro_endereco.servicos.CepServico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cep")
public class CepControlador {

    private final CepServico cepServico;

    public CepControlador(CepServico cepServico) {
        this.cepServico = cepServico;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrarCep(@RequestBody CepDTO cepDTO){
        cepServico.cadastrarCep(cepDTO);
        return ResponseEntity.ok("Cep Cadastrado");
    }
}
