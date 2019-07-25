package training.servlets.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ShowCheckboxValues")
public class ShowCheckboxValues extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		
		String[] interests = request.getParameterValues("interests");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("Your name is " + username);
		
		for(String temp : interests) {
			out.println(temp);
		}
	}
	

}
