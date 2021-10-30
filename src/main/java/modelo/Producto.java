package modelo;

import java.sql.Date;

public class Producto {

	public int id;
	public int id_categoria;
	public String nombre;
	public String descripcion;
	public double precio;
	public int stock;
	public Date fecha_alta;
	public Date fecha_baja;
	public float impuesto;
	
	public Producto() {
		
	}

	public Producto(int id, int id_categoria, String nombre, String descripcion, double precio, int stock,
			Date fecha_alta, Date fecha_baja, float impuesto) {
		super();
		this.id = id;
		this.id_categoria = id_categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.fecha_alta = fecha_alta;
		this.fecha_baja = fecha_baja;
		this.impuesto = impuesto;
	}

	public int getId() {
		return id;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public Date getFecha_alta() {
		return fecha_alta;
	}

	public Date getFecha_baja() {
		return fecha_baja;
	}

	public float getImpuesto() {
		return impuesto;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}

	public void setImpuesto(float impuesto) {
		this.impuesto = impuesto;
	}
	
	
	
	
}
