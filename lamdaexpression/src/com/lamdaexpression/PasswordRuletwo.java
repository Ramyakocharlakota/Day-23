package com.lamdaexpression;

	import java.util.Scanner;
import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	@FunctionalInterface
	interface IPasswordTwo {
		public String validate(String regex, String field);
	}

	public class PasswordRuletwo {

		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Please log in using 8 character password having one upper case.");
				System.out.print("Enter the password : ");
				String field = sc.next();
				IFName isValiLastName = (pattern, passWord) -> {

					return "The password you have entered is " + Pattern.compile(pattern).matcher(passWord).matches() + ".";
				};

				System.out.println(isValiLastName.validate("^(?=.*[A-Z])[A-Za-z]{8}$", field));
			}

		}


}
