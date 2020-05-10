package com.uca.capas.domain;



import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	@Size(message= "El nombre no debe tener mas de 15 caracteres",max=15)
	@NotEmpty(message="El nonmbre no puede estar vacio")
	private String nombre;
	
	@Size(message= "El nombre no debe tener mas de 30 caracteres",max=30)
	@NotEmpty(message="El nonmbre no puede estar vacio")
	private String descripcion;
	
	@NotNull(message= "el campo no puede estar vacio")
	@Min(value=0,message= "el campo no puede ser negativo")
	private double precio;
	@NotEmpty(message= "el campo no puede estar vacio")
	@Pattern(regexp="^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$",message="El campo debe estar en el formato dd/mm/yyyy")
	private String vencimiento;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	
	

}
