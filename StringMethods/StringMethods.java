package com.metacube;

public class StringMethods {

	/**
	 * In this we will compare String1 and String2
	 * @param string1, first string to compare
	 * @param string2, second string to compare
	 * @return boolean, return true if strings are equal else return false
	 */
	public boolean compareStrings(String string1 , String string2) {	
		int string1Length = string1.length();
		int string2Length = string2.length();
		if ( string1Length != string2Length ) {
			return false;
		}
		
		for ( int i =0; i<string1Length; i++ ) {
			if ( string1.charAt(i) != string2.charAt(i) ) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * To reverse a string 
	 * @param string1, string which we want to reverse
	 * @return string , return reversed String
	 */
	public String reverseString(String string1) {
		int string1Length = string1.length();
		char[] reversedString = new char[string1Length];
		
		//reversing character by character
		for ( int i=0; i<=string1Length/2; i++ ) {
			char temporaryStoringCharacter = string1.charAt(string1Length-1-i);
			reversedString[string1Length-1-i] = string1.charAt(i);
			reversedString[i] = temporaryStoringCharacter;
		}
		
		return new String(reversedString);
	}
	
	/**
	 * To Swap character's case in a string
	 * @param string , string in which we will swap character's
	 * @return string , return the case swapped string
	 */
	public String caseSwappedString(String string) {
		int stringLength = string.length();
		char[] swappedString = new char[stringLength];
		
		for ( int i=0; i<stringLength; i++ ) {
			char ch = string.charAt(i);
			
			if ( ch>= 'a' & ch <= 'z' ) {
				swappedString[i] = (char)(ch - 'a'+'A');
			} else if ( ch>= 'A' & ch <= 'Z' ) {
				swappedString[i] = (char)(ch - 'A'+'a');				
			} else {
				swappedString[i] = ch;
			}
		}
		
		return new String(swappedString);
	}
	 
	/**
	 * To find largest word in a string
	 * @param string, string in which we have to find largest word
	 * @return string, return largest word in the param string
	 */
	public String largestWordInString(String string) {
		int maxLengthOfWord = 0;
		String maxWordString = "";
		int wordStart = 0;
		int stringLength = string.length();
		
		for ( int i=0; i<=stringLength; i++ ) {
			//to find end of a word or string
			if ( i == stringLength || string.charAt(i) == ' ' ) {
				int currentWordLength = i - wordStart ;
				if ( maxLengthOfWord <= currentWordLength ) {
					maxLengthOfWord = currentWordLength;
					maxWordString = string.substring(wordStart, i);
				}
				wordStart = i+1;
			}
		}
		
		return maxWordString;
	}
	
	
}
