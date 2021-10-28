package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import modelo.RolDAO;

/**
 * Servlet implementation class RolServlet
 */
@WebServlet("/Rol")
public class RolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger(RolServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RolServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		String rolnuevo = request.getParameter("rolnuevo");
		logger.info(String.format(">>>>>> intentnado crear rol nuevo ." + rolnuevo));
		RolDAO roldao = new RolDAO();
		roldao.insertarRol(rolnuevo);
		logger.info(String.format(">>>>>> rol nuevo insertado." + rolnuevo));
		response.sendRedirect("Login/Menu.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
