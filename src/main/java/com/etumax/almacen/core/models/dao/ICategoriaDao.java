package com.etumax.almacen.core.models.dao;

import com.etumax.almacen.core.models.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaDao extends JpaRepository<Categoria,Long> {

}
