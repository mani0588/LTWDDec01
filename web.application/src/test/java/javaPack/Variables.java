package javaPack;

public class Variables {

	// global / public variable
	// constant / final variable

	public final int NUM1 = 10; // non-static / instance
	public final static int NUM2 = 20; // static / class

	public void sum(int a, int b) {
		int c = a + b;
		System.out.println(c);

		// a,b, c - local variable
	}

	public static void mul(int a, int b) {
		int c = a * b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		// Variables - its memory address where we store values
		// 3 types - local, static, non-static

		// local - declared inside a method or a block {}
		// static / class - outside the method and with static keyword
		// non-static / instance - outside the method and without static keyword

		// calling static variables and methods by class name
		System.out.println(Variables.NUM2);
		Variables.mul(2, 3);

		// calling non-static variables and methods by instance name
		Variables obj = new Variables();
		System.out.println(obj.NUM1);
		obj.sum(2, 3);

	}

}
