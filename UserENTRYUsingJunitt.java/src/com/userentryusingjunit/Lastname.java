package com.userentryusingjunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lastname {
	public static void main(String[] args) {

		String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
		Pattern regex = Pattern.compile(namePattern);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name : ");
		String inputStr = sc.nextLine();
		Matcher firstNameMatcher = regex.matcher(inputStr);
		sc.close();
		if (firstNameMatcher.matches()) {
			System.out.println(inputStr + " is valid name.");
		} else {
			System.out.println(inputStr + " is invalid name.Kindly input the right one.");
		}
	}

}
