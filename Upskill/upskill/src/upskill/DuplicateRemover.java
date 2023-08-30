package upskill;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemover {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(4);
		numbers.add(1);
		
		List<Integer> uniqueNumbers = removeDuplicates(numbers);
		System.out.println("Original numbers:" + numbers);
		System.out.println("Unique numbers:" + uniqueNumbers);
	}
	
	public static List<Integer> removeDuplicates(List<Integer> list){
	   List<Integer> uniqueList = list.stream()
	                                  .distinct()
	                                  .collect(Collectors.toList());
	
	return uniqueList;
}
}
