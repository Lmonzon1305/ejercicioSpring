package com.Spring.practica.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.practica.dao.ClientesDao;
import com.Spring.practica.modelos.Clientes;

@RestController
public class ClientesControlador {
	@Autowired
	private ClientesDao clientesDao;
	
	@GetMapping("api/clientes")
	public List <Clientes> getClientes(){
		List <Clientes> user=clientesDao.getClientes();
		return user;
	}

}
