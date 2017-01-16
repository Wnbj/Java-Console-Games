package homework.lesson.seven;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two integer numbers separate by space:");
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		if (end < start) {
			int temp = end;
			end = start;
			start = temp;
		}
		
		draw(start, end);
		
	}
	
	static void draw(int start, int end){
		
		if (start > end) {
			return;
		}
		
			draw(start, end - 1);
			
			for (int i = start; i <= end; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
				
		
	}
	
}
