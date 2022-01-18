package com.lamdaexpression;

	import java.util.Scanner;
	import java.util.regex.Pattern;

	@FunctionalInterface
	interface IPassword {
		public String validate(String regex, String field);
	}

	public class PasswordRuleone {

		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Please log in using 8 character password.");
				System.out.print("Enter the Password : ");
				String field = sc.next();
				IFName isValiLastName = (pattern, passWord) -> {

					return "The password you have entered is " + Pattern.compile(pattern).matcher(passWord).matches()+ ".";
				};

				System.out.println(isValiLastName.validate("^[A-Za-z]{8}$", field));
			}
			System.out.println("");

		}

}
