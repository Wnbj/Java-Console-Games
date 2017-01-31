package homework.lesson.five;

public class Task3 {
	public static void main(String[] args) {
		
		int[][] table = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65}
				}; 
		int size = table.length * table[1].length;
		int sum = 0;
		
		
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[1].length; j++) {
				sum += table[i][j];
			}
		}
		
		double average = (double)sum / size ;
		
		System.out.printf("The sum is %d%n", sum);
		System.out.printf("The average is %.2f", average);
		
	}
}
