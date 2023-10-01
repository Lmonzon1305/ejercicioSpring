package com.Spring.practica.dao;

import java.util.List;

import com.Spring.practica.modelos.Usuarios;

import jakarta.transaction.Transactional;


@Transactional
public interface UsuariosDao {
	List <Usuarios> getUsuarios();
	void eliminar(Long id);
	void registrar(Usuarios usuario);
	boolean verificarCredenciales(Usuarios usuario);
}
