package com.marcos.cadastro_endereco.controladores;

import com.marcos.cadastro_endereco.dto.BairroDTO;
import com.marcos.cadastro_endereco.servicos.BairroServico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bairro")
public class BairroControlador {

    private final BairroServico bairroServico;

    public BairroControlador(BairroServico bairroServico) {
        this.bairroServico = bairroServico;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrarBairro(@RequestBody BairroDTO bairroDTO){
        bairroServico.cadastrarBairro(bairroDTO);
        return ResponseEntity.ok("Bairro Cadastrado");
    }
}
