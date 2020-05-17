package by.htp.les04.branch;

public class Task15 {

	public static void task() {
		double a = 2.0;
		double b = 3.0;

		if (a == b) {
			System.out.println("Incorrect numbers (equal)");
			return;
		}

		if (a < b) {
			a = (a + b) / 2;
			System.out.println(a);
		} else {
			b = a * b * 2;
			System.out.println(b);
		}

		if (b < a) {
			b = (a + b) / 2;
			System.out.println(a);
		} else {
			b = a * b * 2;
			System.out.println(b);
		}

	}

}
