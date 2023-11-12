package java_ex100;

import java.util.Scanner;

public class ex100_25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		if ( a != b) {
			System.out.printf("1");
		}
		else if ( a == b) {
			System.out.printf("0");
		}
		scan.close();
	}
}