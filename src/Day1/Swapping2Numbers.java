package Day1;

import java.util.Scanner;

public class Swapping2Numbers {

	public static void main(String[] args) {
		
//		int a = 10;
//		int b = 20;
//		
//		System.out.println("Before Swapping: " + a + "," + b);
//		
//		int temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println("After Swapping: " + a + "," + b);
		
		//Taking input from User
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter Value b: ");
		int b = sc.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swapping: " + a + "," + b);
		
	}

}
