package javaPack;

public class MethodsAndOverloadingAndInheritance {

	// overloading - will have same method name more than one time
	// with different parameter type or
	// with different number of parameter

	public int sum(int a, int b) {
		// 10 lines
		int c = a + b;
		System.out.println(c);
		return c;
	}

	public float sum(float a, float b) {
		// 10 lines
		float c = a + b;
		System.out.println(c);
		return c;
	}

	public float sum(float a, float b, float d) {
		// 10 lines
		float c = a + b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {

		MethodsAndOverloadingAndInheritance obj = new MethodsAndOverloadingAndInheritance();
		int res1 = obj.sum(2, 5);
		// few other codes
		int res2 = obj.sum(12, 43);

		int a = 10;

		int diff = res1 - res2;
		System.out.println(diff);

		System.out.println(obj.sum(2.2f, 3.3f));
//		or
//		if(x.type == int)
//		{
//			System.out.println(obj.sumInt(2,3));
//		}
//		else if(x.type == float)
//		{
//			System.out.println(obj.sumFloat(2.2f, 3.3f));
//		}

	}

}
