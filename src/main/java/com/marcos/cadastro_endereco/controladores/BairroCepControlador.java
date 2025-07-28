package com.marcos.cadastro_endereco.controladores;

import com.marcos.cadastro_endereco.dto.BairroCepDTO;
import com.marcos.cadastro_endereco.servicos.BairroCepServico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bairro-cep")
public class BairroCepControlador {

    private final BairroCepServico bairroCepServico;

    public BairroCepControlador(BairroCepServico bairroCepServico) {
        this.bairroCepServico = bairroCepServico;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrarBairroCep(@RequestBody BairroCepDTO bairroCepDTO){
        bairroCepServico.cadastrarBairroCep(bairroCepDTO);
        return ResponseEntity.ok("Bairro e Cep vinculados");
    }
}
