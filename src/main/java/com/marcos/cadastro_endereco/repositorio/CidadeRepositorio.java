package com.marcos.cadastro_endereco.repositorio;

import com.marcos.cadastro_endereco.entidades.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepositorio extends JpaRepository<Cidade, Integer> {
}
