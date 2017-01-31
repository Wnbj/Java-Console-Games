package homework.oop.notepad;

import java.util.Scanner;

public class IO {

	public static String getInput(){
		Scanner scan = new Scanner(System.in);	
		return scan.nextLine();
	}
	
	public static void print(String output){
		System.out.println(output);
	}
	
}
