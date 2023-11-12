package java_ex100;

import java.util.Scanner;

public class ex100_17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a;
		
		a = scan.nextInt();
		
		System.out.printf("%x", a);
		//Integer.toHexString(i)
		
		scan.close();
	}
}