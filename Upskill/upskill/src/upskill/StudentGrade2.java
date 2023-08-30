package upskill;

import java.util.Scanner;

public class StudentGrade2 {
		public static void main(String[] args) {
			
			System.out.println("Enter the grade : ");
			Scanner sc= new Scanner(System.in);
			char n=sc.next().charAt(0);
			
			//using switch case
			switch(n) {
			
			case 'A':
				System.out.println("Excellent job!");
				break;
			
			case 'B':
				System.out.println("Good job!");
				break;
				
			case 'C':
				System.out.println("Average job!");
				break;
				
			case 'D':
				System.out.println("Needs to improve!");
				break;
				
			case 'F':
				System.out.println("Failed!");
				break;
				
				default:
					System.out.println("Invalid Grade");
				
			}

}
}
