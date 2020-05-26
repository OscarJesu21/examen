package com.upaxer.WebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upaxer.WebApp.model.UsuariosBean;
import com.upaxer.WebApp.service.UsuarioService;

@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping("/consultar")
	public List<UsuariosBean> getAllUsuarios() throws Exception{
		
		List<UsuariosBean> lstBean = null;

		lstBean = usuarioService.getAll();
		
		return lstBean;
		
	}
	@RequestMapping("/guardarUsuario")
	public UsuariosBean saveUsuarios(UsuariosBean bean) {
		if(bean!=null) {
			UsuariosBean usuarioBean = null;
			usuarioBean = usuarioService.saveUsuario(bean);
			
			if(usuarioBean!=null) {
				return usuarioBean;
			}
			
		}
		return null;
	}
	@RequestMapping("/actualizarUsuario")
	public UsuariosBean actualizaUsuario(UsuariosBean bean) {
		if(bean!=null) {
			UsuariosBean usuarioBean = null;
			usuarioBean = usuarioService.saveUsuario(bean);
			
			if(usuarioBean!=null) {
				return usuarioBean;
			}
			
		}
		return null;
	}
	@RequestMapping("/eliminarUsuario")
	public UsuariosBean eliminarUsuario(UsuariosBean bean) {
		
		return null;
	}
	
	
}