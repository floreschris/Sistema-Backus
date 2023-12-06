package com.flowired.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class IngresoProducto {

	private Integer id_Operacion;
	private Integer id_productos;
	private Integer id_Proveedor;
	private Integer id_Almacen;
	private Integer id_Empleado;
	private LocalDateTime FechaOperacion;
	private LocalDate FechaVencimiento;
	private int cantidad;

	public Integer getId_Operacion() {
		return id_Operacion;
	}

	public void setId_Operacion(Integer id_Operacion) {
		this.id_Operacion = id_Operacion;
	}

	public Integer getId_productos() {
		return id_productos;
	}

	public void setId_productos(Integer id_productos) {
		this.id_productos = id_productos;
	}

	public Integer getId_Proveedor() {
		return id_Proveedor;
	}

	public void setId_Proveedor(Integer id_Proveedor) {
		this.id_Proveedor = id_Proveedor;
	}

	public Integer getId_Almacen() {
		return id_Almacen;
	}

	public void setId_Almacen(Integer id_Almacen) {
		this.id_Almacen = id_Almacen;
	}

	public Integer getId_Empleado() {
		return id_Empleado;
	}

	public void setId_Empleado(Integer id_Empleado) {
		this.id_Empleado = id_Empleado;
	}

	public LocalDateTime getFechaOperacion() {
		return FechaOperacion;
	}

	public void setFechaOperacion(LocalDateTime fechaOperacion) {
		FechaOperacion = fechaOperacion;
	}

	public LocalDate getFechaVencimiento() {
		return FechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		FechaVencimiento = fechaVencimiento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public IngresoProducto(Integer id_Operacion, Integer id_productos, Integer id_Proveedor, Integer id_Almacen,
			Integer id_Empleado, LocalDateTime fechaOperacion, LocalDate fechaVencimiento, int cantidad) {
		super();
		this.id_Operacion = id_Operacion;
		this.id_productos = id_productos;
		this.id_Proveedor = id_Proveedor;
		this.id_Almacen = id_Almacen;
		this.id_Empleado = id_Empleado;
		FechaOperacion = fechaOperacion;
		FechaVencimiento = fechaVencimiento;
		this.cantidad = cantidad;
	}

}
