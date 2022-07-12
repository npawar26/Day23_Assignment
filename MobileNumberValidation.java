package com.bridgelabz;


	import java.util.Scanner;
	import java.util.regex.Pattern;

	@FunctionalInterface
	 interface Interface4 {
		public String validate(String regex, String element);
	 }

	 public class MobileNumberValidation implements Interface4 {

		@Override
		public String validate(String regex, String element) {
			return null;
		}

	 public static void main(String[] args) {

		System.out.println("Enter mobile number");
		Scanner scanner = new Scanner(System.in);
		String mobilenumber = scanner.next();
		Interface4 isValid = (regex, element) -> {
		return "Given mobile number is " + Pattern.compile(regex).matcher(element).matches();
		};
		    scanner.close();
			System.out.println(isValid.validate("^(91-){1}[6-9][0-9]{9}$", mobilenumber));
	  }
	    
	}
