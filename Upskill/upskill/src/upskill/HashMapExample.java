package upskill;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer>studentGrades=new HashMap<>();
		
		studentGrades.put("Jhon",95);
		studentGrades.put("Mike",83);
		studentGrades.put("Wick",65);
		studentGrades.put("Sam",97);
		
		System.out.println("Original HashMap data:");
		for (Map.Entry<String, Integer>entry : studentGrades.entrySet()) {
			System.out.println(entry.getKey()+": "+ entry.getValue());
		}
		
		String lowestGradeStudent = null;
		int lowestGrade = Integer.MAX_VALUE;
		
		for(Map.Entry<String, Integer>entry:studentGrades.entrySet()) {
			if (entry.getValue()<lowestGrade) {
				lowestGrade=entry.getValue();
				lowestGradeStudent=entry.getKey();
			}
		}
		
		if(lowestGradeStudent !=null) {
			studentGrades.remove(lowestGradeStudent);
		}
		
		System.out.println("HashMap data after removing the lowest grade student:");
		for (Map.Entry<String, Integer>entry:studentGrades.entrySet()) {
			System.out.println(entry.getKey()+ ": " +entry.getValue());
		}
	}
		

}
