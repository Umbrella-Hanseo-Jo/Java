package java_ex100;

import java.util.Scanner;

public class ex100_15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
				int a;
				int b;
				int c;
				
				a = scan.nextInt();
				b = scan.nextInt();
				c = scan.nextInt();
				
				System.out.printf("%d.%02d.%02d", a, b, c);
				//String result = String.format(“%02d”, i); 
				
				scan.close();
	}
}