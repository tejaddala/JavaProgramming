package day1;

import java.util.HashSet;

public class DuplicateNum {

	public static void main(String[] args) {
		
		int a[] = {2,1,8,3,9,7,6,6,2,3};
		boolean flag = false;
		
		/*for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println("Duplicate Number: " + a[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false) {
			
			System.out.println("-------Not Found any Duplicate Number-------");
		}*/
		
		HashSet <Integer>values = new HashSet();
		
		for(int v : a) {
			
			if(values.add(v) == false) {
				
				System.out.println("Duplicate Number: " + v);
				flag=true;
			}
		}
		
		if(flag==false) {
			
			System.out.println("-----Duplicate Num Not Found------");
		}

	}

}
