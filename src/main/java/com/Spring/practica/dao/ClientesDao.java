package com.Spring.practica.dao;

import java.util.List;

import com.Spring.practica.modelos.Clientes;

import jakarta.transaction.Transactional;

@Transactional
public interface ClientesDao {
	List <Clientes> getClientes();
}
