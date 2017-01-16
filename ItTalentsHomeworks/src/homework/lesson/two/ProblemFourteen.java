package homework.lesson.two;

import java.util.Scanner;

public class ProblemFourteen {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
        System.out.print("Please enter X for the first field: ");
        int x1 = scan.nextInt();
        System.out.print("Please enter Y for the first field: ");
        int y1 = scan.nextInt();
        System.out.print("Please enter X for the second field: ");
        int x2 = scan.nextInt();
        System.out.print("Please enter Y for the second field: ");
        int y2 = scan.nextInt();
 
        int firstSum = x1 + y1;
        int secondSum = x2 + y2;
 
        boolean isFirstDiff = (firstSum % 2 == 0) && (secondSum % 2 != 0);
        boolean isSecondDiff = (firstSum % 2 != 0) && (secondSum % 2 == 0);
 
        if (isFirstDiff || isSecondDiff) {
            System.out.println("The two fields are in different color.");
        } 
        else {
            System.out.println("Both fields are in same color.");
        }
    }
	
}
