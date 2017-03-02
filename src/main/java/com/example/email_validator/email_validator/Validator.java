package com.example.email_validator.email_validator;

public class Validator {

	public boolean validate ( String email) {
		if (email.matches("[^@]*@[^@]*") && email.matches(".*[.].*") && email.matches(".*[A-Za-z0-9]-*[A-Za-z0-9].*") && email.matches(".*[.]+((com)|(ca))"))
			return true;
		else
			return false;
	}

}
