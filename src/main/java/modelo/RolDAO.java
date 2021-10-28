package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import conexion.Conexion;

public class RolDAO {

	private Connection conexion;

	public Rol getRol() {

		conexion = Conexion.getConexion();
		Rol rol = null;
		if (conexion != null) {

			try {
				PreparedStatement ps = conexion.prepareStatement("select * from roles");

				ResultSet resultado = ps.executeQuery();
				while (resultado.next()) {
					rol = new Rol();
					rol.setId(resultado.getInt("id"));
					rol.setRol(resultado.getString("rol"));
				}
				resultado.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return rol;

	}
	
	public void insertarRol(String  rol) {
		conexion = Conexion.getConexion();

		
		PreparedStatement ps;
		try {
			ps = conexion.prepareStatement("INSERT INTO roles (rol) " + "VALUES (?)");
			ps.setString(1, rol);
			ps.executeUpdate();
			conexion.commit();
			// Conexion.desconectar();

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}
	
	 public HashMap<Integer, Rol> getTodosRolQuery() {

	        conexion = Conexion.getConexion();
	        Rol rol;
	        HashMap<Integer, Rol> listaRoles = null;
	        if (conexion != null) {
	        	listaRoles = new HashMap<>();
	            try {
	                PreparedStatement ps = conexion.prepareStatement("select * from roles");

	                ResultSet resultado = ps.executeQuery();

	                while (resultado.next()) {
	                	rol = new Rol();
	                	rol.setId(resultado.getInt("id"));
	                	rol.setRol(resultado.getString("rol"));
	                
	                	listaRoles.put(rol.getId(), rol);
	                }
	                
	                resultado.close();
	                ps.close();

	            } catch (SQLException ex) {
	                System.out.println("Error en SQL en el metodo devolver todos los usuario");
	            } 

	        }
	        return listaRoles;

	    }
	

}
