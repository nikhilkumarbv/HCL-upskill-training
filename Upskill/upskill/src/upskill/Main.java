package upskill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class Student {
	String name;
	int age;
	double grade;
	
	public Student(String name, int age, double grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getGrade() {
		return grade;
	}
	
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Grade:" + grade;
	}

}

public class Main  {
	public static void main(String[] args) {
 
	List<Student> studentList= new ArrayList<>();
	studentList.add(new Student("Tim",20,85.5));
	studentList.add(new Student("Bob",22,78.5));
	studentList.add(new Student("Charlie",21,92.3));
	studentList.add(new Student("Jhon",19,67.8));
	
	Collections.sort(studentList, Comparator.comparingInt(Student::getAge).reversed());
	
	System.out.println("Sorted by age in descending order:");
	for(Student student : studentList) {
		System.out.println(student);
	}
	
	Collections.sort(studentList, Comparator.comparing(Student::getName));
	
	System.out.println("\nSorted by name:");
	for(Student student : studentList) {
		System.out.println(student);
	}
	
	Collections.sort(studentList, Comparator.comparingDouble(Student::getGrade));
	System.out.println("\nSorted by grade:");
	for(Student student : studentList) {
		System.out.println(student);
	}
	}
}

