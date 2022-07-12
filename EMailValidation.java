package com.bridgelabz;

	import java.util.Scanner;
	import java.util.regex.Pattern;

	@FunctionalInterface
	 interface Interface3 {
		public String validate(String regex, String element);
	 }

	 public class EMailValidation implements Interface3 {

		@Override
		public String validate(String regex, String element) {
			return null;
		}

	 public static void main(String[] args) {

		System.out.println("enter Email Address");
		Scanner scanner = new Scanner(System.in);
		String eMail = scanner.next();
		Interface3 isValid = (regex, element) -> {
		return "Given email is " + Pattern.compile(regex).matcher(element).matches();
		};
		    scanner.close();
			System.out.println(isValid.validate("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", eMail));
	  }
	    
	}
