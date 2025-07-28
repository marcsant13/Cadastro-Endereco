package com.marcos.cadastro_endereco.repositorio;

import com.marcos.cadastro_endereco.entidades.BairroCep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BairroCepRepositorio extends JpaRepository<BairroCep, Integer> {
}
