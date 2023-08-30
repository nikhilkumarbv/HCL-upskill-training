package upskill;

import java.util.Scanner;

public class FactorialOfANumber {
	public static void main(String[] args) {
		
		int fact=1;
		int i=1;
		
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of a number is :"+fact);
	}

}
