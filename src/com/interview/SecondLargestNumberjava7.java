package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumberjava7 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(10);
		list.add(10);
		list.add(9);
		list.add(9);
		list.add(8);
		list.add(4);
		list.add(6);

		// Sort the list in ascending order
		Collections.sort(list);

		// Find the index of the largest number
		int largestIndex = list.lastIndexOf(Collections.max(list));

		// Iterate backward from the largest index to find the second largest number
		int secondLargest = Integer.MIN_VALUE;
		for (int i = largestIndex - 1; i >= 0; i--) {
			if (!list.get(i).equals(list.get(largestIndex))) {
				secondLargest = list.get(i);
				break;
			}
		}

		System.out.println("Second largest number: " + secondLargest);
	}
}
