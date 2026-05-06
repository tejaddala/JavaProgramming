package Day1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		
		String str = sc.next();
		
		//Using String Concatenation
		//String rev = "";
		/*int len = str.length();
		
		for(int i=len-1; i>=0; i--) {
			
			rev = rev + str.charAt(i);
		}*/
		
		//Using String CharArray
		
		/*char a[] = str.toCharArray();
		int len = a.length;
		
		for(int i=len-1; i>=0; i--) {
			
			rev = rev + a[i];
		}*/
		
		//StringBuffer Class
		/*StringBuffer sb = new StringBuffer(str);
		StringBuffer rev = sb.reverse();*/
		
		//StringBuilder Class
		StringBuilder sbl = new StringBuilder();
		sbl.append(str);
		StringBuilder rev = sbl.reverse();
		
		
		
		System.out.println("Reversed String: " + rev);
	}

}
