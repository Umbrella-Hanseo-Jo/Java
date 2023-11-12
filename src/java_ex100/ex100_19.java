package java_ex100;

import java.util.Scanner;

public class ex100_19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int asc_ = scan.nextInt();
		
		char char_ = (char) asc_;
		
		if (asc_ > 255) {
			System.out.println("YOU HAVE MORE THAN 255 LETTERS");
		}
		
		else {
			System.out.printf("%c",  char_);
		
		scan.close();
		
		}
	}
}