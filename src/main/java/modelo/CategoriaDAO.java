package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

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

	 public HashMap<Integer, Categoria> getTodasCategoriasQuery() {

	        conexion = Conexion.getConexion();
	        Categoria categoria;
	        HashMap<Integer, Categoria> listaCategorias = null;
	        if (conexion != null) {
	        	listaCategorias = new HashMap<>();
	            try {
	                PreparedStatement ps = conexion.prepareStatement("select * from categorias");

	                ResultSet resultado = ps.executeQuery();

	                while (resultado.next()) {
	                	categoria = new Categoria();
	                	categoria.setId(resultado.getInt("id"));
	                	categoria.setNombre(resultado.getString("nombre"));
	                	categoria.setDescripcion(resultado.getString("descripcion"));
	                	listaCategorias.put(categoria.getId(), categoria);
	                
	                	
	                }
	                
	                resultado.close();
	                ps.close();

	            } catch (SQLException ex) {
	                System.out.println("Error en SQL en el metodo devolver todos los usuario");
	            } 

	        }
	        return listaCategorias;

	    }

}
