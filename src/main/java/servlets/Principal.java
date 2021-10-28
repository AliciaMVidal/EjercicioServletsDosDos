package servlets;

import modelo.Rol;
import modelo.RolDAO;

public class Principal {

	public static void main(String[]args) {
		Rol rol = new Rol();
		RolDAO roldao = new RolDAO();
		rol = roldao.getRol();
		rol.toString();
		
	}
}
