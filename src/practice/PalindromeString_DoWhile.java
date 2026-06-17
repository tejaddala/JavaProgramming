package practice;

import java.util.Scanner;

public class PalindromeString_DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		
		String orgStr = str;
		String rev = "";
		
		int i=str.length()-1;
		
		do {
			
			rev = rev + str.charAt(i);
			i--;
			
		} while(i>=0);
		
		if(orgStr.equals(rev)) {
			
			System.out.println("Palindrome...");
			
		} else {
			
			System.out.println("Not Palindrome..");
		}

	}

}
