package homework.lesson.two;

import java.util.Scanner;

public class ProblemTwelve {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please, enter day: ");
		int day = scan.nextInt();
		
		System.out.print("Please, enter month: ");
		int month = scan.nextInt();
		
		System.out.print("Please, enter year: ");
		int year = scan.nextInt();
		
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			if(day == 31 && month == 12){
				day = 1;
				month = 1;
				year++;
			}
			else if(day == 31 && month != 12){
				month++;
				day=1;
			}
			else{
				day++;
			}
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11){
			if(day == 30){
				day=1;
				month++;
			}
			else{
				day++;
			}
		}
		else{
			if(isLeap && day == 29){
				day=1;
				month++;
			}
			else if(!isLeap && day == 28){
				day=1;
				month++;
			}
			else{
				day++;
			}
		}
		
		System.out.printf("%d.%d.%d", day, month, year);
		
	}
}
