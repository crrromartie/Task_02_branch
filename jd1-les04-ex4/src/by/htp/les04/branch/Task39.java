package by.htp.les04.branch;

public class Task39 {

	public static void task() {
		double x = 10.0;
		double y = 0.0;

		if (x >= 8) {
			y = -Math.pow(x, 2) + x - 9;
		} else {
			y = 1 / (Math.pow(x, 4) - 6);
		}
		System.out.println(y);
	}

}
