package com.userentryusingjunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailId2 {
	public static void main(String[] args) {

		String mailPattern = "^abc(.+)[A-Za-z0-9]{3}+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$";
		Pattern regex = Pattern.compile(mailPattern);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the email ID : ");
		String inputStr = sc.nextLine();
		Matcher emailIDMatcher = regex.matcher(inputStr);
		sc.close();
		if (emailIDMatcher.matches()) {
			System.out.println(inputStr + " is valid mail.");
		} else {
			System.out.println(inputStr + " is invalid mail address.Kindly input the right one.");
		}
	}

}
