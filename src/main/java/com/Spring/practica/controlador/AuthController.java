package com.Spring.practica.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.practica.dao.UsuariosDao;
import com.Spring.practica.modelos.Usuarios;

@RestController
public class AuthController{
	
	@Autowired
	private UsuariosDao usuariosDao;
	
	@RequestMapping(value="api/login",method=RequestMethod.POST)
	public String login(@RequestBody Usuarios usuario) {
		if(usuariosDao.verificarCredenciales(usuario)) {
			return "OK";
		}
		return "Fail";
	}
}