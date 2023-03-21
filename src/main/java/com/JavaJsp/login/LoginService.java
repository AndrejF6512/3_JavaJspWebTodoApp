package com.JavaJsp.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("todos") && password.equals("andrej"))
			return true;

		return false;
	}

}
