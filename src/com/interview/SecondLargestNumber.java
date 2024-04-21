package com.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
List<Integer> list = Arrays.asList(1, 2, 10, 10, 9, 9, 8, 4, 6);
        
        // Find the second largest number using Java 8 Stream API
        Integer secondLargest = list.stream()
                .distinct() // Remove duplicates
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(1) // Skip the first largest number
                .findFirst() // Get the first element after skipping
                .orElse(Integer.MIN_VALUE); // If no second largest number found, return Integer.MIN_VALUE

        System.out.println("Second largest number: " + secondLargest);
	}

}
