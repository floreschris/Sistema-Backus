package com.flowired.model;

import java.time.LocalDateTime;

public class DetalleVenta {

	private Integer id_Venta;
	private Integer id_Empleado;
	private int monto_Total;
	private LocalDateTime Fecha_Hora;
	
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
	public int getMonto_Total() {
		return monto_Total;
	}
	public void setMonto_Total(int monto_Total) {
		this.monto_Total = monto_Total;
	}
	public LocalDateTime getFecha_Hora() {
		return Fecha_Hora;
	}
	public void setFecha_Hora(LocalDateTime fecha_Hora) {
		Fecha_Hora = fecha_Hora;
	}
	public DetalleVenta(Integer id_Venta, Integer id_Empleado, int monto_Total, LocalDateTime fecha_Hora) {
		super();
		this.id_Venta = id_Venta;
		this.id_Empleado = id_Empleado;
		this.monto_Total = monto_Total;
		Fecha_Hora = fecha_Hora;
	}

}
