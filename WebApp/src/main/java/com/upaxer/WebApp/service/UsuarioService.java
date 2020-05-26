package com.upaxer.WebApp.service;

import java.util.List;

import com.upaxer.WebApp.model.UsuariosBean;


public interface UsuarioService {


	public UsuariosBean saveUsuario(UsuariosBean bean);
	public List<UsuariosBean> getAll();
	public UsuariosBean updateUsuario(UsuariosBean bean);
	public UsuariosBean deleteUsuario(int id);

}