package com.marcos.cadastro_endereco.servicos;

import com.marcos.cadastro_endereco.dto.EnderecoDTO;
import com.marcos.cadastro_endereco.entidades.Endereco;
import com.marcos.cadastro_endereco.repositorio.EnderecoRepositorio;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServico {

    private final EnderecoRepositorio enderecoRepositorio;
    private final PessoaServico pessoaServico;
    private final LogradouroServico logradouroServico;

    public EnderecoServico(EnderecoRepositorio enderecoRepositorio, PessoaServico pessoaServico, LogradouroServico logradouroServico) {
        this.enderecoRepositorio = enderecoRepositorio;
        this.pessoaServico = pessoaServico;
        this.logradouroServico = logradouroServico;
    }

    public void cadastrarEndereco(EnderecoDTO enderecoDTO){
        Endereco endereco = new Endereco();
        endereco.setNumeroEndereco(enderecoDTO.getNumeroEndereco());
        endereco.setComplemento(enderecoDTO.getComplemento());
        endereco.setPessoa(pessoaServico.buscarPessoa(enderecoDTO.getIdPessoa()));
        endereco.setLogradouro(logradouroServico.buscarLogradouro(enderecoDTO.getIdLogradouro()));
        enderecoRepositorio.save(endereco);
    }
}
