package com.bridgelabz;


	import java.util.Scanner;
	import java.util.regex.Pattern;

	@FunctionalInterface
	 interface Interface2 {
		public String validate(String regex, String element);
	 }

	 public class LastNameValidation implements Interface2 {

		@Override
		public String validate(String regex, String element) {
			return null;
		}

	 public static void main(String[] args) {

		System.out.println("enter last name");
		Scanner scanner = new Scanner(System.in);
		String lastName = scanner.next();
		Interface2 isValid = (regex, element) -> {
		return "Given last name is " + Pattern.compile(regex).matcher(element).matches();
		};
		    scanner.close();
			System.out.println(isValid.validate("(^[A-Z]{1}[a-z]{2}$)", lastName));
	  }
	    
	}
