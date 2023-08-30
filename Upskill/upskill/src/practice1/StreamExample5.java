package practice1;

import java.util.Arrays;
import java.util.List;

public class StreamExample5 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5,2,8,3,9,1,4,6);
		
		long totalElements = numbers.stream()
				.count();
		
		System.out.println("Total number of elements in the list: " + totalElements);
	}
}
