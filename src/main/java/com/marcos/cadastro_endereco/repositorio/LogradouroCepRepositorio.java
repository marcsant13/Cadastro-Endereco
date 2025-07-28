package com.marcos.cadastro_endereco.repositorio;

import com.marcos.cadastro_endereco.entidades.LogradouroCep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogradouroCepRepositorio extends JpaRepository<LogradouroCep, Integer> {
}
