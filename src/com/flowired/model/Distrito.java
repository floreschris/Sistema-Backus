package com.flowired.model;

public class Distrito {

	private Integer id_Distrito;
	private String nombre_Distrito;

	public Integer getId_Distrito() {
		return id_Distrito;
	}

	public void setId_Distrito(Integer id_Distrito) {
		this.id_Distrito = id_Distrito;
	}

	public String getNombre_Distrito() {
		return nombre_Distrito;
	}

	public void setNombre_Distrito(String nombre_Distrito) {
		this.nombre_Distrito = nombre_Distrito;
	}

	public Distrito(Integer id_Distrito, String nombre_Distrito) {
		super();
		this.id_Distrito = id_Distrito;
		this.nombre_Distrito = nombre_Distrito;
	}

}
