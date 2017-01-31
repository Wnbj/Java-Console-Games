package homework.lesson.five;

public class Task5 {
	public static void main(String[] args) {
		
		int[][] matrix = {
				{48,72,13,14},
				{21,22,53,24},
				{31,57,33,34},
				{41,95,43,44},
				}; 
		
		int colsSum = 0;
		int rowsSum = 0;
		int bestRow = 0;
		int bestCol = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {				
				rowsSum += matrix[i][j];
				colsSum += matrix[j][i];
				if (j == matrix.length - 1) {
					if (rowsSum > bestRow) {
						bestRow = rowsSum;
					}
					if (colsSum > bestCol) {
						bestCol = colsSum;
					}
				}
			}
			rowsSum = 0;
			colsSum = 0;
			
		}	
		System.out.printf("The largest row sum is %d%nThe largest col sum is %d%n", bestRow, bestCol);
		System.out.print(bestCol == bestRow?"The Largest row sum and the largest col sum are equal.":
			bestRow > bestCol?"The Largest row sum is bigger than the largest col sum.":
			"The Largest col sum is bigger than the largest row sum.");
		
		
	}
}
