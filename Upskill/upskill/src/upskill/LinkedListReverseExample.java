package upskill;

import java.util.LinkedList;

public class LinkedListReverseExample {
	public static void main(String[] args) {
		LinkedList<String> names=new LinkedList<>();
		
		names.add("Ganga");
		names.add("Yamuna");
		names.add("Narmada");
		
		System.out.println("Original order of name:"+names);
		
		LinkedList<String>reversedNames =new LinkedList<>();
		for (String name : names) {
			reversedNames.addFirst(name);
		}
		
		System.out.println("Names in reverse order:"+reversedNames);

	}
}
