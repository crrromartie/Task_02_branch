package by.htp.les04.branch;

public class Task40 {

	public static void task() {
		double x = 5.0;
		double y = 0.0;

		if (x <= 13) {
			y = -Math.pow(x, 3) + 9;
		} else {
			y = -(3 / (x + 1));
		}
		System.out.println(y);
	}

}
