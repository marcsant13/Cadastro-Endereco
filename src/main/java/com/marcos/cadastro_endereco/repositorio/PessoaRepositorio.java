package com.marcos.cadastro_endereco.repositorio;

import com.marcos.cadastro_endereco.entidades.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepositorio extends JpaRepository<Pessoa, Integer> {
}
