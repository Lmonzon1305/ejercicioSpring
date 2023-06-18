package com.Spring.practica.dao;

import java.util.List;

import com.Spring.practica.modelos.Usuarios;

import jakarta.transaction.Transactional;


@Transactional
public interface UsuariosDao {
	List <Usuarios> obtenerUsuarios();
}
