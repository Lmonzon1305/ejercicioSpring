package com.Spring.practica.controlador;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.practica.dao.UsuariosDao;
import com.Spring.practica.modelos.Usuarios;


@RestController
public class UsuarioControlador {
	
	@Autowired
	private UsuariosDao usuariosDao;
	
	@GetMapping("mensaje")
	public String mensaje() {
		
		return "Hola Mundo";
	}
	@GetMapping("persona")
	public List<String> ListarPersonas(){
		
		return List.of("Diego","Juan","Jose");
	}
	
	@RequestMapping(value="usuarios")
	public Usuarios listarUsuarios() {
		Usuarios usuario=new Usuarios("Diego", "Vargas", "dvargasgodoy@gmail.com", "155619965", "1234");
		
		return usuario;
	}
	@RequestMapping(value="usuarios/{id}")
	public Usuarios getUsuarios(@PathVariable Long id) {
		Usuarios usuario=new Usuarios("Diego", "Vargas", "dvargasgodoy@gmail.com", "155619965", "1234");
		usuario.setId(id);
		return usuario;
	}
	
	@RequestMapping(value="listar/usuarios")
	public List<Usuarios> listar_variosUsuarios() {
		
		List<Usuarios> usuarios=new ArrayList<>();
		
		Usuarios usuario1=new Usuarios("Diego", "Vargas", "dvargasgodoy@gmail.com", "155619965", "1234");
		usuario1.setId(3L);
		
		Usuarios usuario2=new Usuarios("Jose", "Puentes", "jpseeeey@gmail.com", "155264985", "4321");
		usuario2.setId(4L);
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		return usuarios;
	}
	
	@GetMapping("api/usuarios")
	public List<Usuarios> getUsuarios() {
	List<Usuarios> user=usuariosDao.obtenerUsuarios();
	return user;
	}	

}
