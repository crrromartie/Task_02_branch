package by.htp.les04.branch;

public class Task11 {

	public static void task() {
		double a = 5.0;
		double b = 5.0;
		double c = 5.0;

		double a1 = 6.0;
		double b1 = 6.0;
		double c1 = 6.0;

		if ((a + b) <= c || (a + c) <= b || (c + b) <= a) {
			System.out.println("1 triangle is not correct");
			return;
		}

		if ((a1 + b1) <= c1 || (a1 + c1) <= b1 || (c1 + b1) <= a1) {
			System.out.println("2 triangle is not correct");
			return;
		}

		double p = (a + b + c) / 2.0;
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		double p1 = (a1 + b1 + c1) / 2.0;
		double s1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));

		if (s > s1) {
			System.out.println("Square 1 triangle = " + s + " bigge");
		} else if (s1 > s) {
			System.out.println("Square 2 triangle = " + s1 + " bigger");
		} else {
			System.out.println("Square equal");
		}

	}

}
