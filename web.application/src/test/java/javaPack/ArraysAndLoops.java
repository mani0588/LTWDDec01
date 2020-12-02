package javaPack;

import java.util.Arrays;

public class ArraysAndLoops {

	public static void main(String[] args) {

		// Array - group of values with same datatype
		int[] nums = { 10, 20, 30, 40, 50, 60, 70 };

		System.out.println("All values in the array " + Arrays.toString(nums));
		System.out.println("Total number of values " + nums.length);
		System.out.println("First val " + nums[0]);
		System.out.println("Third val " + nums[3]);
		System.out.println("Last val " + nums[nums.length - 1]);

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] * 2);
		}
		
		
		// Methods, Exception, Overloading and inheritance, Collection basics, read excel
		

	}

}
