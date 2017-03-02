package com.example.email_validator.email_validator;

public class Validator {
	
	//checks to see if a String follows four formatting rules
	public int validate (String email) {
		int x = 0;
		if (email.matches("[^@]*@[^@]*"))
			x++;
		if (email.matches(".*[.].*"))
			x++;
		if (email.matches(".*[A-Za-z0-9]-*[A-Za-z0-9].*"))
			x++;
		if (email.matches(".*[.]+((com)|(ca))"))
			x++;
		return x;
	}
			
}

