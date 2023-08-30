package upskill;
import java.util.ArrayList;
import java.util.List;

public class AverageCalculator {
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		double average = calculateAverage(numbers);
		System.out.println("Average: "+ average);
	}
	
	public static double calculateAverage(List<Integer> numbers) {
		int sum = numbers.stream()
				         .mapToInt(Integer::intValue)
				         .sum();
		
		double average = (double) sum / numbers.size();
		
		return average;
	}


}
