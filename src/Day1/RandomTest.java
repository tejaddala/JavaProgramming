package day1;

import java.util.ArrayList;
import java.util.Collections;

public class RandomTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(5);
		num.add(2);
		num.add(55);
		num.add(12);
		num.add(10);
		num.add(8);
		num.add(15);
		num.add(15);
		
		
		Collections.frequency(num,15);
		Collections.sort(num);
		
		System.out.println("Numbers in array: " + num);
		System.out.println("Max number in array: " + Collections.max(num));
		System.out.println("Min number in array: " + Collections.min(num));
		System.out.println(Collections.frequency(num,15));

	}

}
