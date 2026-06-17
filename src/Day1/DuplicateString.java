package day1;

import java.util.HashSet;

public class DuplicateString {

	public static void main(String[] args) {
		
		String a[] = {"java", "python", "C++", "Dotnet", "Ruby", "Typescript", "Javascript"};
		boolean flag=false;
		
		/*for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println("Duplicate found: " + a[i]);
					flag=true;
				}
			}
		}
		if(flag==false) {
			
			System.out.println("----Not Found----Duplicate------");
		}*/
		
		HashSet<String> hs = new HashSet();
		
		for( String s : a) {
			
			if(hs.add(s) == false) {
				
				System.out.println("Duplicate found: " + s);
				flag=true;
			}
		}
		
		if(flag==false) {
			
			System.out.println("------Not Found Duplicate------");
		}

	}

}
