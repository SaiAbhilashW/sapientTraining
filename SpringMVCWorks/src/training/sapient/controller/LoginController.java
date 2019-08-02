package training.sapient.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	//method 1 to call loginPage.jsp
	//https://localhost:8080/SpringMVC/login
	@RequestMapping("/login")
	public String getLoginPage() {
		return "loginPage";
		
	}
	
	
	//method 2 to do validation
	@RequestMapping("/LoginValidate")
	public ModelAndView loginValidate(HttpServletRequest req, HttpServletResponse res) {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		if(name.equals("sapient") && password.equals("india")) {
			String msg = "Hello " + name;
			return new ModelAndView("loginsuccess","message",msg);
		}
		String msgfail = "Login failed";
		return new ModelAndView("loginfailure","message",msgfail);
	}
}
