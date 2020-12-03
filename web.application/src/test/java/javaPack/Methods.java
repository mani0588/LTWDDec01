package javaPack;

public class Methods {

	public int sum(int a, int b) {
		// 10 lines
		int c = a + b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {

		Methods obj = new Methods();
		int res1 = obj.sum(2, 5);
		// few other codes
		int res2 = obj.sum(12, 43);

		int diff = res1 - res2;
		System.out.println(diff);

	}

}
