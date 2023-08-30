package upskill;

import java.util.Arrays;
import java.util.List;

public class SecondSmallestAndLargest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,45,9,23,67,4,31,19);
		
		int secondSmallest = numbers.stream()
				.distinct()
				.sorted()
				.skip(1)
				.findFirst()
				.orElse(-1);
		
		int secondLargest = numbers.stream()
				.distinct()
				.sorted((a,b) -> b.compareTo(a))
				.skip(1)
				.findFirst()
				.orElse(-1);
		
		System.out.println("List of numbers:" + numbers);
		System.out.println("Second smallest:" + secondSmallest);
		System.out.println("Second largest: " + secondLargest);
	}

}
