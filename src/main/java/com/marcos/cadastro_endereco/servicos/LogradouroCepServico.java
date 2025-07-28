package com.marcos.cadastro_endereco.servicos;

import com.marcos.cadastro_endereco.dto.LogradouroCepDTO;
import com.marcos.cadastro_endereco.entidades.LogradouroCep;
import com.marcos.cadastro_endereco.repositorio.LogradouroCepRepositorio;
import org.springframework.stereotype.Service;

@Service
public class LogradouroCepServico {

    private final LogradouroCepRepositorio logradouroCepRepositorio;
    private final LogradouroServico logradouroServico;
    private final CepServico cepServico;

    public LogradouroCepServico(LogradouroCepRepositorio logradouroCepRepositorio, LogradouroServico logradouroServico, CepServico cepServico) {
        this.logradouroCepRepositorio = logradouroCepRepositorio;
        this.logradouroServico = logradouroServico;
        this.cepServico = cepServico;
    }

    public void cadastrarLogradouroCep(LogradouroCepDTO logradouroCepDTO){
        LogradouroCep logradouroCep = new LogradouroCep();
        logradouroCep.setLogradouro(logradouroServico.buscarLogradouro(logradouroCepDTO.getIdLogradouro()));
        logradouroCep.setCep(cepServico.buscarCep(logradouroCepDTO.getIdCep()));
        logradouroCepRepositorio.save(logradouroCep);
    }

}
