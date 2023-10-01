package com.Spring.practica.dao;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.Spring.practica.modelos.Usuarios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuariosDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public List<Usuarios> getUsuarios() {
		
		String query="from Usuarios";
		
		return entityManager.createQuery(query).getResultList();
	}

	@Override
	public void eliminar(Long id) {
		
		Usuarios usuario=entityManager.find(Usuarios.class,id);
		
		entityManager.remove(usuario);
	}

	@Override
	public void registrar(Usuarios usuario) {
		
		entityManager.merge(usuario);
	}

	@Override
	public boolean verificarCredenciales(Usuarios usuario) {
			
			String query="FROM Usuarios Where email = :email AND password = :password";
			
			List<Usuarios> lista= entityManager.createQuery(query).setParameter("email",usuario.getEmail())
					.setParameter("password",usuario.getPassword()).getResultList();
			
			if(lista.isEmpty()) {
				return false;
				}else {
					return true;
				}
		
	}
}
