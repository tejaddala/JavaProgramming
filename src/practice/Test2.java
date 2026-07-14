package practice;

public class Test2 {

	public static void main(String[] args) {
		
		//----------Count Number of Digits---------------
		
		/*int num = 123456;
		int count = 0;
		
		while(num>0) {
			
			int rem = num%10;
			count++;
			num = num/10;
		}
		
		System.out.println("Number of Digits: " + count);
	}*/
		
		
		
		//----------------Prime-Number----------------------
		
		/*int num = 17;
		int count=0;
		
		if(num>1) {
			
			for(int i=1; i<=num; i++) {
				
				if(num%i==0)
					count++;
			}
			
			if(count==2) {
				
				System.out.println(num + ": is a Prime Number");
				
			} else {
				
				System.out.println(num + ": is not a Prime Number");
				
			}
			
		} else {
			
			System.out.println(num + ": is not a Prime Number");
		}*/
		
		
		
		//-------------String-Reverse------------
		
		//String str = "Test Automation";
		//String rev = "";
		
		/*for(int i=0; i<str.length(); i++) {
			
			rev = str.charAt(i) + rev;
		}*/
		
		/*for(int i = str.length()-1; i>=0; i--) {
			
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Reversed String: " + rev);*/
		
		
		//----------------String-Reverse-Words------------------
		
		/*String str = "Selenium Java Test Automation";
		
		String[] words = str.split(" ");
		
		for(int i=words.length-1; i>=0; i--) {
			
			System.out.print(words[i] + " ");
		}*/
		
		
		//---------------Reverse-Number--------------
		
		/*int num = 234567;
		int rev =0;
		
		while(num>1) {
			
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("Reversed Number: " + rev);*/
		
		//-------------------Palindrome-String----------------------------
		
		/*String str = "Madam";
		String orgStr = str;
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			rev = rev + str.charAt(i);
		}
		
		if(orgStr.equals(rev)) {
			
			System.out.println("Palindrome");
			
		} else {
			
			System.out.println("Not Palindome");
		}*/
		
		
		//-------------Palindrome-Number--------------
		
		/*int num = 121;
		int orgNum = num;
		int rev = 0;
		
		while(num!=0) {
			
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		if(orgNum==rev) {
			
			System.out.println("Number is Palindrome....");
			
		} else {
			
			System.out.println("Number is Not Palindrome.....");
		}*/
		
		
		//----------Max-Number-In-Array-----------------
		
		/*int a[] = {2,8,1,11,53,15,23,35};
		
		int max = a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>max) {
				
				max = a[i];
			}
		}
		
		System.out.println("Maximum Number: " + max);*/
		
		
		//------------Min-Number-In-Array----------------
		
		/*int a[] = {11,25,6,2,9,10,5,-1};
		int min = a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<min) {
				
				min = a[i];
			}
		}
		
		System.out.println("Minimum Number: " + min);*/
		
		//------------Second-Largest-Number---------------------
		
		/*int a[] = {9,21,3,56,7,65,16,44};
		
		int max1=0; int max2=0;
		
		if(a[0]>a[1]) {
			
			max1 = a[0];
			max2 = a[1];
			
		} else {
			
			max1 = a[1];
			max2 = a[0];
		}
		
		for(int i=2; i<a.length; i++) {
			
			if(a[i]>max1) {
				
				max2 = max1;
				max1 = a[i];
				
			} else if (a[i]>max2) {
				
				max2 = a[i];
			}
		}
		
		System.out.println("Largest Number: " + max1);
		System.out.println("Second Largest Number: " + max2);*/
		
		
		//---------Duplicate-Number--OR--Number Occurance-----
		
		/*int a[] = {2,8,6,11,1,2,6,9,15,4,6,3,5,2,7,9};
		boolean flag = false;
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println("Duplicate Number: " + a[i]);
					flag=true;
				}
			}
		}*/
		
		//------From the given string, fetch the first and last character------
		
		String str = "Sigmoid";
		
		if(str !=null && !str.isEmpty()){
			
			char first = str.charAt(0);
			char last = str.charAt(str.length()-1);
			
			System.out.println("First Character: " + first);
			System.out.println("Last Character: " + last);
			
		} else {
			
			System.out.println("String is Empty");
		}
	}
	
}
