package java_ex100;

import java.util.Scanner;

public class ex100_21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		int a;
		int b;
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		System.out.printf("%d", (int) Math.pow(a*2,b));
		
		scan.close();
	}
}