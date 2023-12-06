package com.flowired.model;

public class Productos {

	private String id_Producto;
	private String id_Categoria;
	private String id_Marca;
	private String id_Proveedores;
	private String nombre_Producto;
	private double precio_Compra;
	private double precio_Venta;
	private double cantidad;

	public String getId_Producto() {
		return id_Producto;
	}

	public void setId_Producto(String id_Producto) {
		this.id_Producto = id_Producto;
	}

	public String getId_Categoria() {
		return id_Categoria;
	}

	public void setId_Categoria(String id_Categoria) {
		this.id_Categoria = id_Categoria;
	}

	public String getId_Marca() {
		return id_Marca;
	}

	public void setId_Marca(String id_Marca) {
		this.id_Marca = id_Marca;
	}

	public String getId_Proveedores() {
		return id_Proveedores;
	}

	public void setId_Proveedores(String id_Proveedores) {
		this.id_Proveedores = id_Proveedores;
	}

	public String getNombre_Producto() {
		return nombre_Producto;
	}

	public void setNombre_Producto(String nombre_Producto) {
		this.nombre_Producto = nombre_Producto;
	}

	public double getPrecio_Compra() {
		return precio_Compra;
	}

	public void setPrecio_Compra(double precio_Compra) {
		this.precio_Compra = precio_Compra;
	}

	public double getPrecio_Venta() {
		return precio_Venta;
	}

	public void setPrecio_Venta(double precio_Venta) {
		this.precio_Venta = precio_Venta;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public Productos(String id_Producto, String id_Categoria, String id_Marca, String id_Proveedores,
			String nombre_Producto, double precio_Compra, double precio_Venta, double cantidad) {
		super();
		this.id_Producto = id_Producto;
		this.id_Categoria = id_Categoria;
		this.id_Marca = id_Marca;
		this.id_Proveedores = id_Proveedores;
		this.nombre_Producto = nombre_Producto;
		this.precio_Compra = precio_Compra;
		this.precio_Venta = precio_Venta;
		this.cantidad = cantidad;
	}

}