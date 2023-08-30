package upskill;

import java.util.Scanner;

public class OddIntegerException {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Integer :");
		int n=sc.nextInt();
		
		try {
			
			if(n%2==0) {
				System.out.println("number is even");
			}
			else {
				throw new IllegalArgumentException("number is odd");
			}
			
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
