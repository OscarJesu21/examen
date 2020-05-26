package com.upaxer.WebApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upaxer.WebApp.model.UsuariosBean;
import com.upaxer.WebApp.service.UsuarioService;

@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RestController
@RequestMapping("{/usuarios}")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping("/consultar")
	//@GetMapping
	public List<UsuariosBean> getAllUsuarios() throws Exception{
		
//		List<UsuariosBean> lstBean = null;
//
//		lstBean = usuarioService.getAll();
//		
//		return lstBean;
		
		List<UsuariosBean> lstBeann = new  ArrayList<UsuariosBean>();
		UsuariosBean bean = new UsuariosBean ();
		bean.setIdUsuario(1);
		bean.setNombre("Oscar");
		bean.setApellidos("Romero");
		bean.setEdad(25);
		lstBeann.add(bean); 
	
		
		return lstBeann;
		
	}
	@RequestMapping("/guardarUsuario")
	//@PostMapping
	public UsuariosBean saveUsuarios(@RequestBody UsuariosBean bean) {
		if(bean!=null) {
			UsuariosBean usuarioBean = null;
			usuarioBean = usuarioService.saveUsuario(bean);
			
			if(usuarioBean!=null) {
				return usuarioBean;
			}
			
		}
		return null;
	}
	@PutMapping("/actualizarUsuario")
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
	@DeleteMapping("/eliminarUsuario")
	public UsuariosBean eliminarUsuario(UsuariosBean bean) {
		
		return null;
	}
	
	
}
