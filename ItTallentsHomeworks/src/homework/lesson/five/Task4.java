package homework.lesson.five;

public class Task4 {
	public static void main(String[] args) {
		
		int[][] table = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65}
				}; 
			
		for (int j = 0; j < table[1].length; j++) {
			for (int i = table.length - 1; i > 0; i--) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
