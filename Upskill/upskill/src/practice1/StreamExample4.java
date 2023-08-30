package practice1;

import java.util.List;
import java.util.Arrays;

public class StreamExample4 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5,2,8,3,9,1,4,6);
		
		Integer firstElement = numbers.stream()
				.findFirst()
				.orElse(null);
		System.out.println("First element in the list: " + firstElement);
	}

}
