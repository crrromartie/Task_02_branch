package by.htp.les04.branch;

public class Task38 {

	public static void task() {
		double x = 5.0;
		double y = 0.0;

		if (x >= 0 && x <= 3) {
			y = Math.pow(x, 2);
		} else {
			y = 4;
		}
		System.out.println((int) y);
	}

}
