package by.htp.les04.branch;

public class Task13 {

	public static void task() {
		int x1 = -4;
		int y1 = -2;

		int x2 = 2;
		int y2 = 3;

		if ((Math.abs(x1) + Math.abs(y1)) < (Math.abs(x2) + Math.abs(y2))) {
			System.out.println("1 closer");
		} else if ((Math.abs(x1) + Math.abs(y1)) > (Math.abs(x2) + Math.abs(y2))) {
			System.out.println("2 closer");
		} else {
			System.out.println("Poits equidistant");
		}
	}

}
