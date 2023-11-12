package java_ex100;

import java.util.Scanner;

public class ex100_18 {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	
		char input_Char = scan.next().charAt(0);
	
		int asc_ = (int) input_Char;
	
		System.out.printf("%d", asc_);
	
		scan.close();
	
	}
}