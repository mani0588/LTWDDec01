package javaPack;

public class StringFunctions {

	public static void main(String[] args) {

		int[] x = { 10, 12 };

		String name = " Selenium webdriver ";

		System.out.println(name.length());

		String[] words = name.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}

		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());

		System.out.println(name.trim());

		String s1 = "hello";
		String s2 = "Hello";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		System.out.println(s1.contains("ll"));
		System.out.println(s1.startsWith("hel"));
		System.out.println(s1.endsWith("llo"));

		System.out.println(s1.isEmpty());
		s1 = "";
		System.out.println(s1.isEmpty());

		String address = "#10\\d2, [A-Za-z] North street,Chennai - 232323";
		System.out.println(address.replace("North", ""));

		System.out.println(address.replace("[A-Za-z]", ""));
		System.out.println(address.replaceAll("[A-Za-z]", ""));

	}

}
