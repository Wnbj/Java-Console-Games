package homework.lesson.five;

public class Task7 {
	public static void main(String[] args) {

		int[][] table = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
				};
							
		int sum = 0;
		int sumTotal = 0;
		int col = 0;
		
		for(int i = 0; i < table.length; i++){
			if((col + i) % 2 == 0){
				System.out.print(table[col][i] + ", ");
				sum += table[col][i];
			}
			
			if (i == table.length - 1){				
				col++;
				i = -1;
				System.out.printf("the sum of the elements on the row: %d%n",sum);
				sumTotal += sum;
				sum = 0;
				if (col == table.length) {
					break;
				}
			}
		}
		
		System.out.printf("The sum of all the elements: %d", sumTotal);

	}
}
