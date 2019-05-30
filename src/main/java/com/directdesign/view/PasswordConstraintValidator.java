package com.directdesign.view;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<Password, String> {

	public void initialize(Password constraintAnnotation) {
	}

	public boolean isValid(String password, ConstraintValidatorContext context) {
		if (password == null) {
			return false;
		}
		// https://www.thepolyglotdeveloper.com/2015/05/use-regex-to-test-password-strength-in-javascript/
		/*
		 * We essentially want to label a password as having medium strength 
		 * if it contains six characters or more and has at least one lowercase 
		 * and one uppercase alphabetical character or has at least one lowercase 
		 * and one numeric character or has at least one uppercase and 
		 * one numeric character. 
		 */
		return password.matches("^(((?=.*[a-z])(?=.*[A-Z]))|((?=.*[a-z])(?=.*[0-9]))|((?=.*[A-Z])(?=.*[0-9])))(?=.{6,})");	
	}

	
}
