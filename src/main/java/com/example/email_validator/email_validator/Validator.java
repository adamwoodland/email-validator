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
		if (email.matches("[^@]*@[^@]*") && email.matches(".*[.].*"))
			return true;
		else
			return false;
	}
	
	public static void main (String [] args) {
		Validator validator = new Validator("adamwoodland@icloud.com");
		System.out.print(validator.validate());
	}
}
