package com.lamdaexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface ILName {
	public String validate(String regex, String field);
}

public class LastName {

	public static void main(String[] args) {
		  try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the last name :");
			  String field = sc.next();
			IFName isValiLastName = (pattern, lastName) -> {

				return "The input provided is " + Pattern.compile(pattern).matcher(lastName).matches();
			};

System.out.println(isValiLastName.validate("^[A-Z]{1}[a-z]{3,9}$", field));
		}
	}

}
