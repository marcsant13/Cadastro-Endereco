package com.marcos.cadastro_endereco.servicos;

import com.marcos.cadastro_endereco.entidades.Pessoa;
import com.marcos.cadastro_endereco.repositorio.PessoaRepositorio;
import org.springframework.stereotype.Service;

@Service
public class PessoaServico {

    private final PessoaRepositorio pessoaRepositorio;

    public PessoaServico(PessoaRepositorio pessoaRepositorio) {
        this.pessoaRepositorio = pessoaRepositorio;
    }

    public Pessoa buscarPessoa(Integer id){
        return pessoaRepositorio.findById(id).orElseThrow();
    }

}
