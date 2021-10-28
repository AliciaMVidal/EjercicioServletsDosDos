package modelo;

public class Usuario {
	
	public int id;
	public int id_rol;
	public String clave;
	public String nombre;
	
	
	public Usuario() {
		
	}


	public Usuario(int id, int id_rol, String clave, String nombre) {
		this.id = id;
		this.id_rol = id_rol;
		this.clave = clave;
		this.nombre = nombre;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getId_rol() {
		return id_rol;
	}


	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", id_rol=" + id_rol + ", clave=" + clave + ", nombre=" + nombre + "]";
	}
	
	

}
