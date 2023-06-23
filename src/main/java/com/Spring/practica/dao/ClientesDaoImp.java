package com.Spring.practica.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Spring.practica.modelos.Clientes;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ClientesDaoImp implements ClientesDao{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Clientes> obtenerClientes(){
		
		String query ="from Clientes";
		
		return entityManager.createQuery( query ).getResultList();
	}
	
}
