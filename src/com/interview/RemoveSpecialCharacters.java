package com.interview;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		 String input = "G*ua/rdia?n";
	        String output = input.replaceAll("[^a-zA-Z0-9]", "");
	        System.out.println("Output: " + output);

	}

}
