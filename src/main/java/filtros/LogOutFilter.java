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
 * Servlet Filter implementation class LogOut
 */
@WebFilter("/*")
public class LogOutFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LogOutFilter() {
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

		// pass the request along the filter chain
		//chain.doFilter(request, response);
		HttpServletRequest requestcast = (HttpServletRequest)request;
		HttpServletResponse responsecast = (HttpServletResponse)response;
		
		HttpSession session = requestcast.getSession(false);
		//session.invalidate();
		String path = requestcast.getRequestURI();
		//sino se pone lo ultimo el navegador se vuelve loco haciendo redirecciones
		if(session != null || path.endsWith("/Login") || path.endsWith("index.html") || requestcast.getRequestURI().contains("css")) {
			chain.doFilter(request, response);

		}else {
			responsecast.sendRedirect("../index.html");

		}
	}
	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
