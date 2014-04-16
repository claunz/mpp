package week3.day6;

public class AssertionTesting {

	public static void main(String[] args) {

		System.out.println("First println");
		int x = 1;
		x++;
		assert x == 2 : "x is " + x;
		System.out.println("Second println");
		x++;
		assert x == 2 : "x is " + x;
		System.out.println("Third println");
	}
}
