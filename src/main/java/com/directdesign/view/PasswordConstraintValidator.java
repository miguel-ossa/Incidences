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
		return password.matches("[0-9()-]*");	
	}

	
}
