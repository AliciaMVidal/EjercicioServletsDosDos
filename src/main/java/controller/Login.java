package controller;

import modelo.UsuarioDAO;

public class Login {
	public static boolean comprobarPassword(String user, String passw) {
		boolean resultado = false;
		UsuarioDAO modelo = new UsuarioDAO();
		if (modelo.comprobarPassw(user,passw) == true) {
			resultado = true;
			System.out.println("Contrase�a correcta");
		} else {
			System.out.println("Contrase�a incorrecta");
		}

		return resultado;
	}

}
