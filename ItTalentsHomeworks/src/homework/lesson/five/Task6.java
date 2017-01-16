package homework.lesson.five;

public class Task6 {
	public static void main(String[] args) {
		
		int[][] matrix = {
				{48,72,13,14,15,12},
				{21,22,53,24,75,32},
				{31,57,33,34,35,11},
				{41,95,43,44,45,97},
				{59,52,53,54,55,46},
				{61,69,63,64,65,23}
				};
		
		int sumTotal = 0;
		int sum = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i % 2 != 0 && i != 0) {
					if (j == matrix.length - 1) {
						sum += matrix[i][j];
						System.out.printf("%d sum %d%n", matrix[i][j], sum);
						break;
					}
					System.out.print(matrix[i][j] + ", ");
					sum += matrix[i][j];
				}
				
			}
			sumTotal += sum;
			sum = 0;			
		}
		
		System.out.println("The sum off all the elements is " + sumTotal);
	}
}
