package training.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import training.jdbc.beans.Employee;
import training.jdbc.dao.EmployeeDAO;


@WebServlet("/GetAllEmployeeController")
public class GetAllEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> empList = new EmployeeDAO().getAllEmployee();
		String path = "/WEB-INF/views/showEmps2.jsp";
		
		request.setAttribute("employees", empList);
		request.getRequestDispatcher(path).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
