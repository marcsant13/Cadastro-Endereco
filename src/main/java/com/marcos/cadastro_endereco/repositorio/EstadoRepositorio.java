package com.marcos.cadastro_endereco.repositorio;

import com.marcos.cadastro_endereco.entidades.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepositorio extends JpaRepository<Estado, Integer> {
}
