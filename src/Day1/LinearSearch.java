package day1;

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[] = {2,10,8,15,3};
		int key=15;
		boolean flag = false;
		
		for(int i=0; i<a.length-1; i++) {
			
			if(a[i]==key) {
				
				System.out.println("Number found at: " + i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
		
		System.out.println("-----Number not found-------");
		}
	}

}
