package java_ex100;

import java.util.Scanner;

public class ex100_11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
				String a, b;
		
				a = scan.nextLine();
				b = scan.nextLine();
				
				System.out.printf("%s %s", b, a);
				
				scan.close();
	}
}