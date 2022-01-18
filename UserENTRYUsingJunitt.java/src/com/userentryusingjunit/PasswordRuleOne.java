package com.userentryusingjunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRuleOne {
	public boolean passwrdRule(String inputStr) {
		String passwordPattern = "^[A-Za-z]{8}$";
		Pattern regex = Pattern.compile(passwordPattern);
		Matcher passwordMatcher = regex.matcher(inputStr);
		if (passwordMatcher.matches()) {
			System.out.println(inputStr + " succesfully loggedin and passed first rule.");
		} else {
			System.out.println(inputStr + " is invalid password.Kindly input minimum 8 character.");
		}
		return false;
	}
	
	public static void main(String[] args) {
		PasswordRuleOne psswrd = new PasswordRuleOne();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please log in using 8 character password.");
		System.out.print("Enter the Password : ");
		String inputStr = sc.nextLine();
		sc.close();
		psswrd.passwrdRule(inputStr);
	}


}
