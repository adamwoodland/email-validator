package com.example.email_validator.email_validator;

public class Validator {
	
	private String email;
	
	public Validator (String e) {
		email = e;
	}
	
	public String getEmail ( ) {
		return email;
	}
	
	public void setEmail (String e) {
		email = e;
	}

	public boolean validate ( ) {
		if (email.matches("[^@]*@[^@]*") && email.matches(".*[.].*") && email.matches(".*[A-Za-z0-9]-*[A-Za-z0-9].*") && email.matches(".*[.]+((com)|(ca))"))
			return true;
		else
			return false;
	}
	
	public static void main (String [] args) {
		Validator validator = new Validator("adamwoodland@icloud.ca");
		System.out.print(validator.validate());
	}
}
