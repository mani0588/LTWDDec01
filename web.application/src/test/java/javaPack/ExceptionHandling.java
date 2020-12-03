package javaPack;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {

		// Exception - compiler doesnot know how to proceeed
		// 2 types - checked / compile time exception, unchecked / runtime exception
		// 2 ways we can handle exception - try catch, throws
		// try catch can be used for both type of exception
		// throws can be used only for compile time excp
		
		int[] nums = { 10, 20, 33, 2, 46, 346 };
		try {
			System.out.println(nums[6]);
		} catch (Exception e) {
			System.out.println(e);
		}

		Thread.sleep(2000);
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		Thread.sleep(2000);
		
		Thread.sleep(2000);

		System.out.println(nums[0]);

	}

}
