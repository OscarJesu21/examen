package com.upaxer.WebApp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upaxer.WebApp.model.UsuarioHelper;
import com.upaxer.WebApp.model.UsuariosBean;
import com.upaxer.WebApp.model.UsuariosEntity;
import com.upaxer.WebApp.repository.UsuarioRepository;
import com.upaxer.WebApp.service.UsuarioService;


@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuariosRepository;

	@Override
	public UsuariosBean saveUsuario(UsuariosBean bean) {
		
		if(bean!=null) {
			UsuariosBean usuarioBean = new UsuariosBean();

			usuarioBean = UsuarioHelper.entity2Bean(usuariosRepository.save(UsuarioHelper.bean2Entity(bean)));

			return usuarioBean;
		}
		return null;
	}

	@Override
	public List<UsuariosBean> getAll() {
		List<UsuariosBean> lstBean = new ArrayList<UsuariosBean>();
		lstBean = UsuarioHelper.listEntity2ListBean((List<UsuariosEntity>) usuariosRepository.findAll());
		return lstBean;
	}

	@Override
	public UsuariosBean updateUsuario(UsuariosBean bean) {
		if (bean != null) {
			UsuariosBean usuarioBean = new UsuariosBean();

			usuarioBean = UsuarioHelper.entity2Bean(usuariosRepository.save(UsuarioHelper.bean2Entity(bean)));

			return usuarioBean;
		}

		return null;
	}
	

	@Override
	public UsuariosBean deleteUsuario(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
