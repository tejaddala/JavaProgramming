package practice;

public class Test1 {

	public static void main(String[] args) {
		
		//-------String Reverse-------
		/*String str = "Automation";
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Reversed String: " + rev);*/
		
		//-------Num Reverse--------
		/*int num = 123456;
		int rev = 0;
		
		while(num!=0) {
			
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("Reversed Number: " + rev);*/
		
		//-------Palindrome-Num----------
		/*int num = 121;
		int orgNum = num;
		
		int rev = 0;
		
		while(num!=0) {
			
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		if(orgNum==rev) {
			
			System.out.println("Palindrome Number");
		} else {
			
			System.out.println("Not Palindrome Number");
		}*/
		
		//-----Palindrome-String------
		String str = "MadaM";
		String orgStr = str;
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			rev = rev + str.charAt(i);
		}
		
		if(orgStr.equals(rev)) {
			
			System.out.println("Palindrome");
		} else {
			
			System.out.println("Not Palindrome");
		}

	}

}
