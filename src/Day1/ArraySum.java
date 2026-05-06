package Day1;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		
		int a[] = {5,13,18,3,7,9, 10};
		int sum = 0;
		
		/*for(int i=0; i<a.length; i++) {
			
			sum = sum + a[i];
		}*/
		
		for(int value : a) {
			
			sum = sum + value;
		}
		
		System.out.println("Sum of Array: " + sum);

	}

}
