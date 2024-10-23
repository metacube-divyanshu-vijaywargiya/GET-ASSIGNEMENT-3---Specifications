package com.metacube;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StringMethods stringMethods = new StringMethods();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 1. Compare two strings. \n 2. Reverse a String. \n 3. Swap Characters of string. \n 4. Find Largest Word in a string.");
		
		//get input from user
		System.out.println(" Choose an option : ");
		int choice =  scanner.nextInt();
		scanner.nextLine();
		
		switch (choice) {
		
		//compare string
		case 1: 
			System.out.println("Enter first String : ");
			String string1 = scanner.nextLine();
			
			if(string1.length() == 0 || string1 == null) {
				System.out.println("Error : First String length must be greater than 0.");
				break;
			}
			
			System.out.println("Enter Second String : ");
			String string2 = scanner.nextLine();
			
			if(string2.length() == 0 || string2 == null) {
				System.out.println("Error : Second String length must be greater than 0.");
				break;
			}
			
			System.out.println("Result : " + (stringMethods.compareStrings(string1, string2) ? "Strings are equal." : "Strings are not equal."));
			break;
			
		//reverse string
		case 2: 
			System.out.println("Enter String to reverse : ");
			String stringToReverse = scanner.nextLine();
			
			if(stringToReverse.length() == 0 || stringToReverse == null) {
				System.out.println("Error : String length must be greater than 0.");
				break;
			}
			
			System.out.println("Original String : " + stringToReverse + " :: Reversed String : " + stringMethods.reverseString(stringToReverse));
			break;
			
		//swap case of characters in string	
		case 3: 
			System.out.println("Enter String to swap characters : ");
			String stringToSwap = scanner.nextLine();
			
			if(stringToSwap.length() == 0 || stringToSwap == null) {
				System.out.println("Error : String length must be greater than 0.");
				break;
			}
			
			System.out.println("Original String : " + stringToSwap + " :: Swapped String : " + stringMethods.caseSwappedString(stringToSwap));
			break;
			
		//find largest word in a string	
		case 4: 
			System.out.println("Enter String to find largest word : ");
			String stringToFindMaximumLengthWord = scanner.nextLine();
			
			if(stringToFindMaximumLengthWord.length() == 0 || stringToFindMaximumLengthWord == null) {
				System.out.println("Error : String length must be greater than 0.");
				break;
			}
			
			System.out.println("String : " + stringToFindMaximumLengthWord + " :: Largest word : " + stringMethods.largestWordInString(stringToFindMaximumLengthWord) );
			break;
			
		default: 
			System.out.println("Enter Valid input.");
			
		}
	}

}
