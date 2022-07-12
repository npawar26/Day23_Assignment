package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
 interface Interface1 {
	public String validate(String regex, String element);
 }

 public class FirstNameValidation implements Interface1 {

	@Override
	public String validate(String regex, String element) {
		return null;
	}

 public static void main(String[] args) {

	System.out.println("enter first name");
	Scanner scanner = new Scanner(System.in);
	String firstName = scanner.next();
	Interface1 isValid = (regex, element) -> {
	return "Given first name is " + Pattern.compile(regex).matcher(element).matches();
	};
	    scanner.close();
		System.out.println(isValid.validate("^[A-Z][a-z]{2}$", firstName));
  }
    
}
