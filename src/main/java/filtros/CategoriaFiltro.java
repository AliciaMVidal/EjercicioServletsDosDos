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

/**
 * Servlet Filter implementation class CategoriaFiltro
 */
@WebFilter(filterName="FiltroCategoria")
public class CategoriaFiltro implements Filter {

    /**
     * Default constructor. 
     */
    public CategoriaFiltro() {
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
		
		if(usuariorol != 1 || requestcast.getRequestURI().endsWith("AltaCategoria.jsp")) {
			responsecast.sendRedirect("Menu.jsp");
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
