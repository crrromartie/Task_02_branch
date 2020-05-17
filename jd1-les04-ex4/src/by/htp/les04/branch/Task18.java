package by.htp.les04.branch;

public class Task18 {

	public static void task() {
		int a = -1;
		int b = 5;
		int c = -6;
		int counter = 0;

		if (a < 0) {
			counter++;
		}

		if (b < 0) {
			counter++;
		}

		if (c < 0) {
			counter++;
		}

		System.out.println("Count negative numbers  = " + counter);

	}

}
