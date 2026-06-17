package day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		int n2 = sc.nextInt();
		
		int sum = 0;
		
		System.out.print(n1 + "," + n2);
		
		for(int i=2; i<10; i++) {
			
			sum = n1 + n2;
			System.out.print("," + sum);
			n1=n2;
			n2=sum;
		}

	}

}
