package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexion.Conexion;

public class CategoriaDAO {
	
	private Connection conexion;

	
	public void insertarCategoria(Categoria categoria) {
		conexion = Conexion.getConexion();

		
		PreparedStatement ps;
		try {
			ps = conexion.prepareStatement("INSERT INTO categorias (nombre, descripcion) " + "VALUES (?,?)");
			ps.setString(1, categoria.getNombre());
			ps.setString(2, categoria.getDescripcion());
			ps.executeUpdate();
			conexion.commit();
			// Conexion.desconectar();

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	

}
