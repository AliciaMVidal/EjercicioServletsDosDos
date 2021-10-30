package servlets;

import java.util.HashMap;
import java.util.Map;

import modelo.Categoria;
import modelo.CategoriaDAO;
import modelo.Rol;
import modelo.RolDAO;

public class Principal {

	public static void main(String[]args) {
		Rol rol = new Rol();
		RolDAO roldao = new RolDAO();
		rol = roldao.getRol();
		rol.toString();
		
		Categoria cat = new Categoria();
		CategoriaDAO catdao = new CategoriaDAO();
		HashMap<Integer, Categoria> selects = catdao.getTodasCategoriasQuery();
		
		for(Map.Entry<Integer, Categoria> entry : selects.entrySet()) {
		    Integer key = entry.getKey();
		    Categoria value = entry.getValue();
		    System.out.println(key);
		    System.out.println(value);

		    // do what you have to do here
		    // In your case, another loop.
		}
		
	}
}
