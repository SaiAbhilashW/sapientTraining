package training.servlets.basics;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import training.servlets.beans.EmployeeBean;

/**
 * Servlet implementation class RedirectionData
 */
@WebServlet("/ExtractData")
public class ExtractData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//create data
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<EmployeeBean> employeeList = ExtractData.getDummyEmployeeData();
		RequestDispatcher dispatecher = request.getRequestDispatcher("ShowData.jsp");
		request.setAttribute("employeeList", "employeeList");
		request.setAttribute("employeeListLength", employeeList.size());
		dispatecher.forward(request, response);
	}

	private static List<EmployeeBean> getDummyEmployeeData() {
		List<EmployeeBean> employeeList = null;
		EmployeeBean e1 = new EmployeeBean(1, "salah", "egypt", 20000);
		EmployeeBean e2 = new EmployeeBean(1, "salah", "egypt", 20000);
		EmployeeBean e3 = new EmployeeBean(1, "salah", "egypt", 20000);
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		return employeeList;
	}

}
