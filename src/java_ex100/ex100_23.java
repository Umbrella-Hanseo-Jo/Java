package java_ex100;

import java.util.Scanner;

public class ex100_23 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		if (a == b) {
			System.out.println("1");
		}
		
		else {
			System.out.printf("0");
		}
		scan.close();
	}
}