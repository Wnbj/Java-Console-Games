package homework.lesson.four;

public class Task5 {
	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i * 3;
		}
		
		for (int nums : numbers) {
			System.out.println(nums);
		}
	}
}
