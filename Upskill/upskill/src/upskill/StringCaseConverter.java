package upskill;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringCaseConverter {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("Hello");
		words.add("World");
		words.add("Java");
		words.add("Streams");
		
		List<String> uppercaseWords = convertToUppercase(words);
		System.out.println("Uppercase words: " +uppercaseWords);
		
		List<String> lowercaseWords = convertToLowercase(words);
		System.out.println("Lowercase words: " +lowercaseWords);
	}
	
	public static List<String> convertToUppercase(List<String> strings){
		List<String> uppercaseStrings = strings.stream()
				                               .map(String::toUpperCase)
				                               .collect(Collectors.toList());
		return uppercaseStrings;
				
	}
	
	public static List<String> convertToLowercase(List<String> strings){
		List<String> lowercaseStrings = strings.stream()
				                               .map(String::toLowerCase)
				                               .collect(Collectors.toList());
	
	return lowercaseStrings;
	}
}
