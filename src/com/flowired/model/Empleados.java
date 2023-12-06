package com.flowired.model;

public class Empleados {

	private String id_Empleado;
	private String id_Distrito;
	private String id_Almacen;
	private String nomEmpleado;
	private String ApeEmpleado;
	private Integer dni;

	public String getId_Empleado() {
		return id_Empleado;
	}

	public void setId_Empleado(String id_Empleado) {
		this.id_Empleado = id_Empleado;
	}

	public String getId_Distrito() {
		return id_Distrito;
	}

	public void setId_Distrito(String id_Distrito) {
		this.id_Distrito = id_Distrito;
	}

	public String getId_Almacen() {
		return id_Almacen;
	}

	public void setId_Almacen(String id_Almacen) {
		this.id_Almacen = id_Almacen;
	}

	public String getNomEmpleado() {
		return nomEmpleado;
	}

	public void setNomEmpleado(String nomEmpleado) {
		this.nomEmpleado = nomEmpleado;
	}

	public String getApeEmpleado() {
		return ApeEmpleado;
	}

	public void setApeEmpleado(String apeEmpleado) {
		ApeEmpleado = apeEmpleado;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Empleados(String id_Empleado, String id_Distrito, String id_Almacen, String nomEmpleado, String apeEmpleado,
			Integer dni) {
		super();
		this.id_Empleado = id_Empleado;
		this.id_Distrito = id_Distrito;
		this.id_Almacen = id_Almacen;
		this.nomEmpleado = nomEmpleado;
		this.ApeEmpleado = apeEmpleado;
		this.dni = dni;
	}

}
