package com.marcos.cadastro_endereco.repositorio;

import com.marcos.cadastro_endereco.entidades.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BairroRepositorio extends JpaRepository<Bairro, Integer> {
}
