package com.flowired.model;

public class Marca {

	private Integer id_Marca;
	private String nombre_Marca;

	public Integer getId_Marca() {
		return id_Marca;
	}

	public void setId_Marca(Integer id_Marca) {
		this.id_Marca = id_Marca;
	}

	public String getNombre_Marca() {
		return nombre_Marca;
	}

	public void setNombre_Marca(String nombre_Marca) {
		this.nombre_Marca = nombre_Marca;
	}

	public Marca(Integer id_Marca, String nombre_Marca) {
		super();
		this.id_Marca = id_Marca;
		this.nombre_Marca = nombre_Marca;
	}

}
