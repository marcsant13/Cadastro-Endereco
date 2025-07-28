package com.marcos.cadastro_endereco.servicos;

import com.marcos.cadastro_endereco.dto.CepDTO;
import com.marcos.cadastro_endereco.entidades.Cep;
import com.marcos.cadastro_endereco.repositorio.CepRepositorio;
import org.springframework.stereotype.Service;

@Service
public class CepServico {

    private final CepRepositorio cepRepositorio;
    private final CidadeServico cidadeServico;

    public CepServico(CepRepositorio cepRepositorio, CidadeServico cidadeServico) {
        this.cepRepositorio = cepRepositorio;
        this.cidadeServico = cidadeServico;
    }

    public void cadastrarCep(CepDTO cepDTO){
        Cep cep = new Cep();
        cep.setNumeroCep(cepDTO.getNumeroCep());
        cep.setCidade(cidadeServico.buscarCidade(cepDTO.getIdCidade()));
        cepRepositorio.save(cep);
    }

    public Cep buscarCep(Integer id){
        return cepRepositorio.findById(id).orElseThrow();
    }

}
