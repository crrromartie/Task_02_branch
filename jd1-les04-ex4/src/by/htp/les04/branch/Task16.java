package by.htp.les04.branch;

public class Task16 {

	public static void task() {
		int x = 5;
		int y = -5;

		if (x == 0 && y != 0) {
			System.out.println("Y");
		} else if (y == 0 && x != 0) {
			System.out.println("X");
		} else if (x > 0 && y > 0) {
			System.out.println("1");
		} else if (x < 0 && y > 0) {
			System.out.println("2");
		} else if (x < 0 && y < 0) {
			System.out.println("3");
		} else if (x > 0 && y < 0) {
			System.out.println("4");
		} else {
			System.out.println("0 0");
		}
	}

}
