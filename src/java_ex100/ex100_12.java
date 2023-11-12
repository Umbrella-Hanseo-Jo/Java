package java_ex100;

import java.util.Scanner;

public class ex100_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String a;
		
		a = scan.nextLine();
		
		if (a.length() > 50) {
			System.out.println("YOU HAVE MORE THAN 50 LETTERS");
		}
		
		else {
			System.out.println(a);
		}
		
		scan.close();
	}
}