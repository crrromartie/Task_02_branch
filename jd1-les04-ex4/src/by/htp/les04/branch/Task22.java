package by.htp.les04.branch;

public class Task22 {

	public static void task() {
		int x = 5;
		int y = 10;

		if (x > y) {
			System.out.println("X = " + x);
			System.out.println("Y = " + y);
		} else if (x < y) {
			int temp = x;
			x = y;
			y = temp;
			System.out.println("X = " + x);
			System.out.println("Y = " + y);
		} else {
			System.out.println("Equal");
		}
	}
}
