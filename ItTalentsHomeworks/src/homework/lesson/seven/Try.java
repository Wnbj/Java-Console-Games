package homework.lesson.seven;

public class Try {
	public static void main(String[] args) {
		
		int x = 5;
		int[] nums = {2,3,8,0,33,6,5,44,1,2,33,4};
		System.out.println(multiply(nums, x, nums.length-1));
	}
	
	static int multiply(int[] nums, int x, int length){
		int result = 1;
		if (length <=0 ) {
			return 1;
		}
		if (length % 2 == 1 && nums[length] > x) {
			return result = multiply(nums, x, length - 2) * nums[length];
		}
		return multiply(nums, x, length -1);
	}
	
}
