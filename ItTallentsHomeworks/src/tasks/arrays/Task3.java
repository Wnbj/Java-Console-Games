package tasks.arrays;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		char target = scan.next().charAt(0);
		char[] chars = new char[length];
		boolean isThere = false;
		
			for (int i = 0; i < chars.length; i++) {
				chars[i] = scan.next().charAt(0);
				if (chars[i] == target) {
					System.out.println(i);		
					isThere = true;
				}
				if (i == chars.length - 1 && !isThere) {
					System.out.println("nope");
				}
			}
		
			
		
	}
}
