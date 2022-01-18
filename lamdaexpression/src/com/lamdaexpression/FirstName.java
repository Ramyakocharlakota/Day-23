package com.lamdaexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IFName {
	public String validate(String regex, String field);
	}
public class FirstName {
	public static void main(String[] args) {
		  try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the first name :");
			  String field = sc.next();
			IFName isValiFirstName = (pattern, firstName) -> {

				return "The input provided is " + Pattern.compile(pattern).matcher(firstName).matches();
			};

System.out.println(isValiFirstName.validate("^[A-Z]{1}[a-z]{3,9}$", field));
		}
	}

}
