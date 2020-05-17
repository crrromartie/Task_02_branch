package by.htp.les04.branch;

public class Task09 {

	public static void task() {
		int a = 5;
		int b = 5;
		int c = 5;
		if ((a + b) <= c || (a + c) <= b || (c + b) <= a) {
			System.out.println("The triangle is not correct");
		} else if (a == b && a == c && b == c) {
			System.out.println("Equilateral triangle");
		} else {
			System.out.println("Triangle is not equilateral");
		}
	}

}
