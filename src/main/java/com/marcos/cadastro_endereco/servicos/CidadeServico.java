package com.marcos.cadastro_endereco.servicos;

import com.marcos.cadastro_endereco.entidades.Cidade;
import com.marcos.cadastro_endereco.repositorio.CidadeRepositorio;
import org.springframework.stereotype.Service;

@Service
public class CidadeServico {

    private final CidadeRepositorio cidadeRepositorio;

    public CidadeServico(CidadeRepositorio cidadeRepositorio) {
        this.cidadeRepositorio = cidadeRepositorio;
    }

    public Cidade buscarCidade(Integer id){
        return cidadeRepositorio.findById(id).orElseThrow();
    }
}
