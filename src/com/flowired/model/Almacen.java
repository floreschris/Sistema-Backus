package com.flowired.model;

public class Almacen {

	private Integer id_Almacen;
	private Integer id_Distrito;
	private String nom_Almacen;
	private String Direccion;

	public Integer getId_Almacen() {
		return id_Almacen;
	}

	public void setId_Almacen(Integer id_Almacen) {
		this.id_Almacen = id_Almacen;
	}

	public Integer getId_Distrito() {
		return id_Distrito;
	}

	public void setId_Distrito(Integer id_Distrito) {
		this.id_Distrito = id_Distrito;
	}

	public String getNom_Almacen() {
		return nom_Almacen;
	}

	public void setNom_Almacen(String nom_Almacen) {
		this.nom_Almacen = nom_Almacen;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public Almacen(Integer id_Almacen, Integer id_Distrito, String nom_Almacen, String direccion) {
		super();
		this.id_Almacen = id_Almacen;
		this.id_Distrito = id_Distrito;
		this.nom_Almacen = nom_Almacen;
		this.Direccion = direccion;
	}

}
