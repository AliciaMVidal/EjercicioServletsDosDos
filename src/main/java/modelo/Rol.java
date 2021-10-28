package modelo;

public class Rol {

	
	public int id;
	public String rol;
	
	
	public Rol(int id, String rol) {
		this.id = id;
		this.rol = rol;
	}
	
	public Rol() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Rol [id=" + id + ", rol=" + rol + "]";
	}
	
	
	
	
}
