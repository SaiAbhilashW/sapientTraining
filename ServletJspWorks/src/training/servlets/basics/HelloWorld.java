package training.servlets.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public HelloWorld() {
        super();
        System.out.println("Hello world, in constructor");
       
    }
    
    public void init() {
    	System.out.println("Hi, im in init, hello world");
    }
    
    public void destroy() {
    	System.out.println("hi, im in destroy, hello world");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//send html content
		out.print("<html>");
		out.print("<head><title>Hello World in servlets</title></head>");
		out.print("<body><h1>Welcome to servlets in sapient, by Abhilash</h1></body>");
		out.print("</html>");
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
