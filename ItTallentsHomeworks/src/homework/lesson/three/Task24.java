package homework.lesson.three;

public class Task24 {
	public static void main(String[] args) {
		
		int n = 1;
		int counter = 1;
		
		while (n <= 9) {
			while(counter <= 9){
				if (counter == 9) {
					System.out.printf("%d*%d", n, counter);
					break;
				}
				System.out.printf("%d*%d,", n, counter);
				counter++;
			}
			n++;
			counter =n;
			System.out.println();
		}

	}
}
