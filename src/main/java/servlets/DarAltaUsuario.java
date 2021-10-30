package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.RolDAO;
import modelo.Usuario;
import modelo.UsuarioDAO;

/**
 * Servlet implementation class DarAltaUsuario
 */
@WebServlet("/DarAltaUsuario")
public class DarAltaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DarAltaUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String usernamenuevo = request.getParameter("newusername");
		String passwordnuevo = request.getParameter("password1");
		System.out.println("Las contraseñas son iguales");
		System.out.println(passwordnuevo);
		UsuarioDAO usuariodao = new UsuarioDAO();
		usuariodao.insertarUsuario(passwordnuevo, usernamenuevo);
		response.sendRedirect("index.html");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
