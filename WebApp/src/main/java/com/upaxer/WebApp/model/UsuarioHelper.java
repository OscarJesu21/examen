package com.upaxer.WebApp.model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioHelper {

	public static UsuariosBean entity2Bean(UsuariosEntity entity) {
		
		if(entity != null) {
			UsuariosBean bean = new UsuariosBean();
			
			if(entity.getIdUsuario()!=null) {
				bean.setIdUsuario(entity.getIdUsuario());
			}
			if (entity.getNombre()!=null) {
				bean.setNombre(entity.getNombre());
			}
			if(entity.getApellidos()!=null) {
				bean.setApellidos(entity.getApellidos());
			}
			if(entity.getEdad()<=0) {
				bean.setEdad(entity.getEdad());
			}
			return bean;
		}
		return null;
		
	}
	public static UsuariosEntity bean2Entity(UsuariosBean bean) {
		
		
		if(bean != null) {
			
			UsuariosEntity entity = new UsuariosEntity();
			
			if(bean.getIdUsuario()!=null) {
				entity.setIdUsuario(bean.getIdUsuario());
			}
			if(bean.getNombre()!=null) {
				entity.setNombre(bean.getNombre());
			}
			if(bean.getApellidos()!=null) {
				entity.setApellidos(bean.getApellidos());
			}
			if(bean.getEdad()<= 0) {
				entity.setEdad(bean.getEdad());
			}
			return entity;
		}
		
		return null;
		
	}
	
	public static List<UsuariosBean> listEntity2ListBean(List<UsuariosEntity> listEntity) {
		if (listEntity != null) {
			List<UsuariosBean> listaBean = new ArrayList<UsuariosBean>();
			for (UsuariosEntity e : listEntity) {
				UsuariosBean bean = new UsuariosBean();
				bean = entity2Bean(e);
				listaBean.add(bean);
			}
			return listaBean;
		}

		return null;
	}

	public static List<UsuariosEntity> listBean2ListEntity(List<UsuariosBean> listBean) {
		if (listBean != null) {
			List<UsuariosEntity> listaEntity = new ArrayList<UsuariosEntity>();
			for (UsuariosBean e : listBean) {
				UsuariosEntity entity = new UsuariosEntity();
				entity = bean2Entity(e);
				listaEntity.add(entity);
			}
			return listaEntity;
		}

		return null;
	}
	
}
