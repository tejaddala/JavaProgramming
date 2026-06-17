package day1;

import java.util.Arrays;

public class SecondLargestArray {

	public static void main(String[] args) {
		
		int a[] = {5,3,7,6,10};
		
		Arrays.sort(a);
		
		int secondLargest = a[a.length-2];
		
		System.out.println("Second Largest Number: " + secondLargest);

	}

}
