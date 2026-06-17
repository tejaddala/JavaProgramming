package practice;

import java.util.Scanner;

public class Palindrome_DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		int orgNum = num;
		int rev = 0;
		
		do {
			
			rev = rev*10 + num%10;
			num = num/10;
			
		} while(num!=0);
		
		if(orgNum==rev) {
			
			System.out.println("Palindrome....");
			
		} else {
			
			System.out.println("Not Palindrome....");
		}

	}

}
