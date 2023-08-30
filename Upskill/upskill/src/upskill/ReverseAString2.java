package upskill;

import java.util.Scanner;

public class ReverseAString2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		String rev=reverseString(s);
		System.out.println("Reverse String :"+rev);
	}
	
	public static String reverseString(String s) {
		StringBuilder SB =new StringBuilder(s);
		return SB.reverse().toString();
	}

}
