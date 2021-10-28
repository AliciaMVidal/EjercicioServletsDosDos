package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import modelo.Usuario;
import modelo.UsuarioDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger(LoginServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		doLogin(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//doLogin(request, response);
	}

	public void doLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UsuarioDAO usuariodao = new UsuarioDAO();
		usuariodao.comprobarPassw(username, password);
		
		
		
		PrintWriter pw = response.getWriter();
		
		if(usuariodao.comprobarPassw(username, password) == true) {
			logger.info(String.format(">>>>>> usuario correcto."));
			Usuario usuario;
			usuario = usuariodao.getUsuario(password, username);
			logger.info(String.format(">>>>>>creando session."));
			HttpSession session = request.getSession();
			String nombresession = usuario.getNombre();
			session.setAttribute("nombresesion", nombresession);
			//hora
			SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
			Date date = new Date(System.currentTimeMillis());
			System.out.println(formatter.format(date));
			session.setAttribute("hora", formatter.format(date));
		
			//response.sendRedirect("Login/bienvenida.html");
			response.sendRedirect("Login/Menu.jsp");
		}else {
			response.sendRedirect("index.html");
			pw.println("no!");
		}
		pw.close();
	}


}
