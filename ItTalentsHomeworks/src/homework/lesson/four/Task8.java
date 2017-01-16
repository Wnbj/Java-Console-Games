package homework.lesson.four;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		
		//  В условието не е уточнено какво да се прави ако има повече от една най-дълга поредица, така че програмата печата първата най-дълга.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		int length = scan.nextInt();			
		int[] numbers = new int[length];
		
		System.out.printf("Please enter %d integer numbers separate by space: ", length);
				
		for (int i = 0; i < length; i++) {
			numbers[i] = scan.nextInt();
		}
		
		int frequency = 1;
	    int bestNumber = numbers[0];
	    int bestFrequency = 0;

	    for(int i = 1; i < length; i++){
	        if(numbers[i] != numbers[i - 1]){ 
	            if(frequency > bestFrequency){
	                bestNumber = numbers[i - 1];
	                bestFrequency = frequency;
	                if (bestFrequency >= numbers.length - i) {
						break;
					}
	            }
	            frequency = 1;
	        }
	        else { 
	            frequency++;
	        }
	    }

	    if( frequency > bestFrequency){
	        bestNumber = numbers[length - 1];
	        bestFrequency = frequency;
	    }
	    
	    for (int i = 0; i < bestFrequency; i++) {
			System.out.printf("%d ", bestNumber);
		}
	}
}
