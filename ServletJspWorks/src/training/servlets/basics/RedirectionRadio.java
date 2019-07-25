package training.servlets.basics;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

/**
 * Servlet implementation class RedirectionRadio
 */
@WebServlet("/RedirectionRadio")
public class RedirectionRadio extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String interests = request.getParameter("interests");
		
		if(interests.equals("sports")) {
			response.sendRedirect("http://www.skysports.com");
		} else if(interests.equals("politics")) {
			response.sendRedirect("http://www.ndtv.com");				
		} else if(interests.equals("business")) {
			response.sendRedirect("http://www.businessinsider.com");							
		} else if(interests.equals("others")) {
			response.sendError(Response.SC_NOT_FOUND,"Sorry we don't support you");
		} 
	}

	

}
