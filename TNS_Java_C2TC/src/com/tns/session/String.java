package com.tns.session;

public class String {

	public static void main(java.lang.String[] args) {
		java.lang.String s="    Ningthem    ";// mutable object
		
		System.out.println(s.concat("Singh")); //Concatenation means combining
		
		
		System.out.println(s.length()); //finding the length of string s
		
		System.out.println(s.toLowerCase()); //change to lowercase
		
		System.out.println(s.toUpperCase()); //change to uppercase
		
		java.lang.String s1="Guwahati";	//string with an object s1 having value Guwahati
		System.out.println(s1.equals("guwahati"));	//s1 is equal to or not to the string given 
		
		System.out.println(s1.equalsIgnoreCase("GUWAHATI"));	//s1 is equal to or not to the string given and ignoring cases
		
		System.out.println(s1.replace('A', 'Z'));	// replacing the letter but since there are 
													//no uppercase A so it ignores and gives the s1 string 
		
		System.out.println(s1.replace('a', 'z'));	//replacing the letter a to z 
		
		System.out.println(s.trim());				//Trimming means removing excess spaces in between the string
		
		System.out.println(s.substring(2));			//ignoring the first 2 values and printing out the rest
		
		System.out.println(s.substring(3,8));		//starting by ignoring the first 3 and printing only till the 8th position
	}

}