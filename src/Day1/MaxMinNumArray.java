package day1;

public class MaxMinNumArray {

	public static void main(String[] args) {
		
		int a[] = {1,5,9,8};
		
		/*int max = a[0];
		
		for(int i=1; i<a.length; i++) {
			
			if(a[i]>max) {
				
				max = a[i];
			}
		}
		
		System.out.println(max);*/
		
		int min = a[0];
		
		for(int i=1; i<a.length; i++) {
			
			if(a[i]<min) {
				
				min = a[i];
			}
		}
		
		System.out.println("Min number in Array: " + min);

	}

}
