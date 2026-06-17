package day1;

public class MissingNumArray {

	public static void main(String[] args) {
		
		int a[] = {11,12,14,15};
		
		int sum1=0;
		for(int i=0; i<a.length; i++) {
			
			sum1 = sum1 + a[i];
		}
		
		System.out.println("Sum of Array: " + sum1);
		
		int sum2=0;
		for(int i=11; i<=15; i++) {
			
			sum2 = sum2+i;
		}
		
		System.out.println("Sum of Range of numbers in Array: " + sum2);
		System.out.println("Missing Number: " + (sum2-sum1));

	}

}
