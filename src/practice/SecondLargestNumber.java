package practice;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int a[] = {23,13,36,54,33,65,12,88};
		
		int max1=0; int max2 = 0;
		
		if(a[0]>a[1]) {
			
			max1 = a[0];
			max2 = a[1];
		}
		
		else {
			
			max1 = a[1];
			max2 = a[0];
		}
		
		for(int i=2; i<a.length; i++) {
			
			if(a[i]>max1) {
				
				max2 = max1;
				max1 = a[i];
			}
			
			else if(a[i]>max2) {
				
				max2 = a[i];
			}
		}
		
		System.out.println("----Largest Number is: " + max1);
		System.out.println("--Second Largest Number is: " + max2);
		

	}

}
