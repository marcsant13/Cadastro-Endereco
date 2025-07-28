package com.marcos.cadastro_endereco.repositorio;

import com.marcos.cadastro_endereco.entidades.Cep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CepRepositorio extends JpaRepository<Cep, Integer> {
}
