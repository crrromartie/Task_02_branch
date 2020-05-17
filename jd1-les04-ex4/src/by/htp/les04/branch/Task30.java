package by.htp.les04.branch;

public class Task30 {

	public static void task() {
		double a = -1.5;
		double b = -7.8;
		double c = -3.2;

		if (a > b && b > c) {
			a *= 2;
			b *= 2;
			c *= 2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

	}

}
