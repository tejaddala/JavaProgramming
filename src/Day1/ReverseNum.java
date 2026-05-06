package Day1;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int num = sc.nextInt();
		/*int rev = 0;
		
		while(num!=0) {
			
			rev = rev*10 + num%10;
			num = num/10;
		}*/
		
		
		//StringBuffer Class
		/*StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();*/
		
		//StringBuilder Class
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		
		System.out.println("Reversed Number: " + rev);

	}

}
