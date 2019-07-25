package training.servlets.services;

import training.servlets.beans.LoginBean;

public class UserBusinessLogic {
	public boolean validateUser(LoginBean lb) {
		//you should connect to db and validate
		return lb.getUsername().equals("Abhi") && lb.getPassword().equals("Abhi");
	}
}
