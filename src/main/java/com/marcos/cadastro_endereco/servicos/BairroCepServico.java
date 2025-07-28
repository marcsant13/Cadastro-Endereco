package com.marcos.cadastro_endereco.servicos;

import com.marcos.cadastro_endereco.dto.BairroCepDTO;
import com.marcos.cadastro_endereco.entidades.BairroCep;
import com.marcos.cadastro_endereco.repositorio.BairroCepRepositorio;
import org.springframework.stereotype.Service;

@Service
public class BairroCepServico {

    private final BairroCepRepositorio bairroCepRepositorio;
    private final CepServico cepServico;
    private final BairroServico bairroServico;

    public BairroCepServico(BairroCepRepositorio bairroCepRepositorio, CepServico cepServico, BairroServico bairroServico) {
        this.bairroCepRepositorio = bairroCepRepositorio;
        this.cepServico = cepServico;
        this.bairroServico = bairroServico;
    }

    public void cadastrarBairroCep(BairroCepDTO bairroCepDTO){
        BairroCep bairroCep = new BairroCep();
        bairroCep.setBairro(bairroServico.buscarBairro(bairroCepDTO.getIdBairro()));
        bairroCep.setCep(cepServico.buscarCep(bairroCepDTO.getIdBairro()));
        bairroCepRepositorio.save(bairroCep);
    }

}
