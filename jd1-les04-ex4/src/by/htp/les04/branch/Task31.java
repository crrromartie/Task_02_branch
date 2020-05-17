package by.htp.les04.branch;

public class Task31 {

	public static void task() {
		int a = 35;
		int b = 8;

		int x = 30;
		int y = 10;
		int z = 9;

		if ((a > x && b > y) || (a > x && b > z) || (a > y && b > x) || (a > y && b > z) || (a > z && b > x)
				|| (a > z && b > y)) {
			System.out.println("The brick will crawl through");
		} else {
			System.out.println("The brick will not crawl through");
		}

	}

}
