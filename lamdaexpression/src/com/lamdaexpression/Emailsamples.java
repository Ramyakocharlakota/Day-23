package com.lamdaexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IEmailIDSample {
	public String validate(String regex, String input);
}

public class Emailsamples {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your Email ID :");
			String input = sc.next();
			IFName isValiLastName = (pattern, emailID) -> {

				return "The password given is " + Pattern.compile(pattern).matcher(emailID).matches();
			};

			System.out.println(isValiLastName.validate("^abc(.+)[A-Za-z0-9]{3}+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$", input));
		}
	}

}
