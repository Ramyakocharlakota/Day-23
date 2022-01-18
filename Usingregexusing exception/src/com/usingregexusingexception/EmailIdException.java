package com.usingregexusingexception;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIdException {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the valid mail ID : ");
		try {
			String namePattern = "^^abc(.+)[A-Za-z0-9]{3}+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$";
			Pattern regex = Pattern.compile(namePattern);
			String inputStr = sc.nextLine();
			char val = inputStr.charAt(20);
			Matcher firstNameMatcher = regex.matcher(inputStr);
			sc.close();
			System.out.print(val);

			if (firstNameMatcher.matches()) {
				System.out.println(inputStr + " is valid name.");
			} else {
				System.out.println(inputStr + " is invalid name.Kindly input the right one.");
			}
		}

		catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}
	}

}
