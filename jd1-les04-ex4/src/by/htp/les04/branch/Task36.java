package by.htp.les04.branch;

public class Task36 {

	public static void task() {
		double x = 3.0;
		double y = 0.0;

		if (x <= 3) {
			y = Math.pow(x, 2) - 3 * x + 9;
		} else {
			y = 1 / (Math.pow(x, 3) + 6);
		}
		System.out.println(y);
	}

}
