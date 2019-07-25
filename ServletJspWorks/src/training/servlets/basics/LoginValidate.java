package training.servlets.basics;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import training.servlets.beans.LoginBean;
import training.servlets.services.UserBusinessLogic;

@WebServlet("/login")
public class LoginValidate extends HttpServlet {
	

	private static final long serialVersionUID = 1L;
	
	
	UserBusinessLogic userBl;
	
	public void init() {
			System.out.println("hello from login validate");
		userBl = new UserBusinessLogic();
	}
       
    
    public LoginValidate() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginBean loginBean = new LoginBean(username,password);
		
		//invoke business logic
		if(userBl.validateUser(loginBean)) {
			//send it to success
			//or dispatch
			RequestDispatcher rd = request.getRequestDispatcher("success");
			
			rd.forward(request, response);
			
			//no statements after forward
		} else {
			//send it to failure
			RequestDispatcher rd = request.getRequestDispatcher("failure");
			rd.include(request, response);
			request.getRequestDispatcher("/Login.html").include(request, response);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
