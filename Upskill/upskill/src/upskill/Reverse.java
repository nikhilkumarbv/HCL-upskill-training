package upskill;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Input");
		String st=sc.nextLine();
		int l =st.length();
		String rev=" ";
		for(int i=l-1;i>=0;i--) {
			rev=rev+st.charAt(i);
		}
		System.out.println("Reverse String:"+rev);
	}

}
