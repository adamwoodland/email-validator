package com.example.email_validator.email_validator;

public class Validator {

	//checks to see if a String follow two formatting rules
	public int validate (String email) {
		int x = 0;
		if (email.matches("[^@]*@[^@]*"))
			x++;
		if ( email.matches(".*[.].*"))
			x++;
		return x;
	}
	
}