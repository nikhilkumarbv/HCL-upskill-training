package practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,23,145,101,222,134,18,100);
		
		List<Integer> numbersStartingWithOne = numbers.stream()
				.filter(n -> String.valueOf(n).startsWith("1"))
				.collect(Collectors.toList());
		
		System.out.println("Numbers starting with 1:" + numbersStartingWithOne);
	}

}
