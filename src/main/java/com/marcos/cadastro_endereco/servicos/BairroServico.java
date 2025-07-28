package com.marcos.cadastro_endereco.servicos;

import com.marcos.cadastro_endereco.dto.BairroDTO;
import com.marcos.cadastro_endereco.entidades.Bairro;
import com.marcos.cadastro_endereco.repositorio.BairroRepositorio;
import org.springframework.stereotype.Service;

@Service
public class BairroServico {

    private final BairroRepositorio bairroRepositorio;
    private final CidadeServico cidadeServico;

    public BairroServico(BairroRepositorio bairroRepositorio, CidadeServico cidadeServico) {
        this.bairroRepositorio = bairroRepositorio;
        this.cidadeServico = cidadeServico;
    }

    public void cadastrarBairro(BairroDTO bairroDTO){
        Bairro bairro = new Bairro();
        bairro.setNomeBairro(bairroDTO.getNomeBairro());
        bairro.setCidade(cidadeServico.buscarCidade(bairroDTO.getIdCidade()));
        bairroRepositorio.save(bairro);
    }

    public Bairro buscarBairro(Integer id){
        return bairroRepositorio.findById(id).orElseThrow();
    }
}
