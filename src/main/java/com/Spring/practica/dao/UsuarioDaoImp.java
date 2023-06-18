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
	public List<Usuarios> obtenerUsuarios() {
		
		String query="from Usuarios";
		
		return entityManager.createQuery(query).getResultList();
	}

}
