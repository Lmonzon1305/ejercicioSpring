package com.Spring.practica.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class Clientes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cliente")
	private int id_cliente;
	@Column (name="nombre")
	private String nombre;
	@Column (name="apellido")
	private String apellido;
	@Column (name="dni")
	private int dni;
	@Column (name="direccion")
	private String direccion;
	@Column (name="metodoDePago")
	private String metodoDePago;
	@Column (name="monto")
	private int monto;
	
	public Clientes() {}
	public Clientes(String nombre, String apellido, int dni, String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getMetodoDePago() {
		return metodoDePago;
	}
	public void setMetodoDePago(String metodoDePago) {
		this.metodoDePago = metodoDePago;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	
}
