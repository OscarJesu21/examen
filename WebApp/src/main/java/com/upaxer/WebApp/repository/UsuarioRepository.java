package com.upaxer.WebApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upaxer.WebApp.model.UsuariosEntity;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuariosEntity, Integer>{

}
