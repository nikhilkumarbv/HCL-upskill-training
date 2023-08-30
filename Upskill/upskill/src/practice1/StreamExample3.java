package practice1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,1,3,3,7,2,2,3,4,5,6,7,8,9,10);
		
		List<Integer> dupNumbers = numbers.stream()
				.filter(n -> Collections.frequency(numbers, n) > 1)
				.collect(Collectors.toList());
		System.out.println("Duplicate numbers in the list:" + dupNumbers);
	}

}
