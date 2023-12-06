package com.flowired.model;

public class Proveedor {

	private Integer id_Proveedor;
	private Integer id_Distrito;
	private String nomb_Proveedor;
	private Integer telefono;

	public Integer getId_Proveedor() {
		return id_Proveedor;
	}

	public void setId_Proveedor(Integer id_Proveedor) {
		this.id_Proveedor = id_Proveedor;
	}

	public Integer getId_Distrito() {
		return id_Distrito;
	}

	public void setId_Distrito(Integer id_Distrito) {
		this.id_Distrito = id_Distrito;
	}

	public String getNomb_Proveedor() {
		return nomb_Proveedor;
	}

	public void setNomb_Proveedor(String nomb_Proveedor) {
		this.nomb_Proveedor = nomb_Proveedor;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Proveedor(Integer id_Proveedor, Integer id_Distrito, String nomb_Proveedor, Integer telefono) {
		super();
		this.id_Proveedor = id_Proveedor;
		this.id_Distrito = id_Distrito;
		this.nomb_Proveedor = nomb_Proveedor;
		this.telefono = telefono;
	}

}
