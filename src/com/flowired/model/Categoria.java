package com.flowired.model;

public class Categoria {

	private Integer id_Categoria;
	private String nomb_Categoria;

	public Integer getId_Categoria() {
		return id_Categoria;
	}

	public void setId_Categoria(Integer id_Categoria) {
		this.id_Categoria = id_Categoria;
	}

	public String getNomb_Categoria() {
		return nomb_Categoria;
	}

	public void setNomb_Categoria(String nomb_Categoria) {
		this.nomb_Categoria = nomb_Categoria;
	}

	public Categoria(Integer id_Categoria, String nomb_Categoria) {
		super();
		this.id_Categoria = id_Categoria;
		this.nomb_Categoria = nomb_Categoria;
	}

}
