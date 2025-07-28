package com.marcos.cadastro_endereco.servicos;

import com.marcos.cadastro_endereco.dto.LogradouroDTO;
import com.marcos.cadastro_endereco.entidades.Logradouro;
import com.marcos.cadastro_endereco.repositorio.LogradouroRepositorio;
import org.springframework.stereotype.Service;

@Service
public class LogradouroServico {

    private final LogradouroRepositorio logradouroRepositorio;
    private final BairroServico bairroServico;

    public LogradouroServico(LogradouroRepositorio logradouroRepositorio, BairroServico bairroServico) {
        this.logradouroRepositorio = logradouroRepositorio;
        this.bairroServico = bairroServico;
    }

    public void cadastrarLogradouro(LogradouroDTO logradouroDTO){
        Logradouro logradouro = new Logradouro();
        logradouro.setNomeLogradouro(logradouroDTO.getNomeLogradouro());
        logradouro.setBairro(bairroServico.buscarBairro(logradouroDTO.getIdBairro()));
        logradouroRepositorio.save(logradouro);
    }

    public Logradouro buscarLogradouro(Integer id){
        return logradouroRepositorio.findById(id).orElseThrow();
    }

}
