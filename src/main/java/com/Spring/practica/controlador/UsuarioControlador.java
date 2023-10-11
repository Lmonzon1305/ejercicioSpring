package com.Spring.practica.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Spring.practica.dao.UsuariosDao;
import com.Spring.practica.modelos.Usuarios;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;


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
	
	@PostMapping(value="api/usuarios")
	public void registrarUsuario(@RequestBody Usuarios usuario) {
		
		Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
		
		String hash= argon2.hash(1,1024,1,usuario.getPassword());
		
		usuario.setPassword(hash);
		
		usuariosDao.registrar(usuario);
	}
	
}
