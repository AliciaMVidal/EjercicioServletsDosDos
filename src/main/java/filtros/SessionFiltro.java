package filtros;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Usuario;

/**
 * Servlet Filter implementation class SessionFiltro
 */
@WebFilter(filterName="FiltroRol")
public class SessionFiltro implements Filter {

    /**
     * Default constructor. 
     */
    public SessionFiltro() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		HttpServletRequest requestcast = (HttpServletRequest)request;
		HttpServletResponse responsecast = (HttpServletResponse)response;
		HttpSession session = requestcast.getSession();
		int usuariorol = (Integer) session.getAttribute("rolsession");
		System.out.println(usuariorol);
		
		//Meter todos en una carpeta y bloquear el acceso a la  carpeta
//		if(usuariorol != 1 || requestcast.getRequestURI().endsWith("AltaRol.jsp") || 
//				requestcast.getRequestURI().endsWith("AltaCategoria.jsp")) {
//			responsecast.sendRedirect("Menu.jsp");
//
//		}else {
//			chain.doFilter(request, response);
//
//		}
		
		
		//En la archivo web.xml bloquear una carpeta no archivo por archivo
		if(usuariorol != 1) {
			responsecast.sendRedirect("Menu.jsp");
		} else {
			chain.doFilter(request, response);
			//
		}

		// pass the request along the filter chain
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
