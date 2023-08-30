package upskill;

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		
		System.out.println("Enter the grade : ");
		Scanner sc= new Scanner(System.in);
		char n=sc.next().charAt(0);
		
		//Using nested if Statement
		if(n=='A') {
			System.out.println("Excellent job!");
		}else
		{
			if(n=='B') {
				System.out.println("Good job!");
			
		}else
		{
			if(n=='C') {
				System.out.println("Average job!");
		}else
		{
			if(n=='D') {
				System.out.println("Needs to improve!");
		}else
		{
			if(n=='E') {
				System.out.println("Failed!");
		}else
		{
			System.out.println("Invalid grade");
		}
	}

}
		}
		}
	}
}
