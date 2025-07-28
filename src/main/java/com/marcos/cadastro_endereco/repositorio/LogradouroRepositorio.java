package com.marcos.cadastro_endereco.repositorio;

import com.marcos.cadastro_endereco.entidades.Logradouro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogradouroRepositorio extends JpaRepository<Logradouro, Integer> {
}
