package java_ex100;

import java.util.Scanner;

public class ex100_20 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		System.out.printf("%d", a+b+c);
		System.out.printf("\n");
		System.out.printf("%.1f", (float) (a+b+c)/3);
		
		scan.close();
	}
}