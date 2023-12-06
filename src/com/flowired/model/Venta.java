package com.flowired.model;

import java.time.LocalDateTime;

public class Venta {

	private Integer id_Venta;
	private Integer id_Empleado;
	private int montoTotal;
	private LocalDateTime fechaHora;

	public Integer getId_Venta() {
		return id_Venta;
	}

	public void setId_Venta(Integer id_Venta) {
		this.id_Venta = id_Venta;
	}

	public Integer getId_Empleado() {
		return id_Empleado;
	}

	public void setId_Empleado(Integer id_Empleado) {
		this.id_Empleado = id_Empleado;
	}

	public int getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(int montoTotal) {
		this.montoTotal = montoTotal;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Venta(Integer id_Venta, Integer id_Empleado, int montoTotal, LocalDateTime fechaHora) {
		super();
		this.id_Venta = id_Venta;
		this.id_Empleado = id_Empleado;
		this.montoTotal = montoTotal;
		this.fechaHora = fechaHora;
	}

}
