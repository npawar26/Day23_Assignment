package com.bridgelabz;


	import java.util.Scanner;
	import java.util.regex.Pattern;

	@FunctionalInterface
	 interface Interface5 {
		public String validate(String regex, String element);
	 }

	 public class PasswordValidation implements Interface5 {

		@Override
		public String validate(String regex, String element) {
			return null;
		}

	 public static void main(String[] args) {

		System.out.println("Enter password");
		Scanner scanner = new Scanner(System.in);
		String password = scanner.next();
		Interface5 isValid = (regex, element) -> {
		return "Given password is " + Pattern.compile(regex).matcher(element).matches();
		};
		    scanner.close();
			System.out.println(isValid.validate("([0-9a-zA-Z]*)([~!@#$]{1})([0-9a-zA-Z]*)", password));
	  }
	    
	}
