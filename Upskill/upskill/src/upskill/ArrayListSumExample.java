package upskill;

import java.util.ArrayList;
public class ArrayListSumExample {
	public static void main(String[] args) {
		ArrayList<Integer>numbers=new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(6);
		
		int sum=0;
		for(int number:numbers) {
			sum+=number;
		}
		System.out.println("Integers in the ArrayList:"+numbers);
		System.out.println("Sum of the Integers:"+sum);
	}

}
