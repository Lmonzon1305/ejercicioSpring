package com.Spring.practica.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Spring.practica.dao.UsuariosDao;
import com.Spring.practica.modelos.Usuarios;


@RestController
public class UsuarioControlador {
	
	@Autowired
	private UsuariosDao usuariosDao;
	
	@GetMapping("api/usuarios")
	public List<Usuarios> getUsuarios() {
		
	List<Usuarios> user=usuariosDao.getUsuarios();
	
	return user;
	}		

	@RequestMapping(value="api/usuarios/{id}", method=RequestMethod.DELETE)
	public void eliminar(@PathVariable Long id) {
		
		usuariosDao.eliminar(id);
	}
	
	@RequestMapping(value="api/usuarios", method=RequestMethod.POST)
	public void registrarUsuario(@RequestBody Usuarios usuario) {
		
		usuariosDao.registrar(usuario);
	}
	
}
