package com.lamdaexpression;

	import java.util.Scanner;
	import java.util.regex.Pattern;

	@FunctionalInterface
	interface IEmailID {
		public String validate(String regex, String inputStr);
	}

	public class EmailId {

		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter a valid email - E.g. abc.xyz@bl.co.in , where abc , bl and co is mandatory.");
				System.out.println("Enter your Email ID :");
				String input = sc.next();
				IFName isValiLastName = (pattern, lastName) -> {

					return "The input provided is " + Pattern.compile(pattern).matcher(lastName).matches();
				};

				System.out.println(isValiLastName.validate("^abc(.+)[A-Za-z0-9]{3}+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$", input));
			}
		}


}
