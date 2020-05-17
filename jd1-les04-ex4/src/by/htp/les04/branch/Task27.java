package by.htp.les04.branch;

public class Task27 {

	public static void task() {
		int a = 4;
		int b = 4;
		int c = 5;
		int d = 5;
		int min1;
		int min2;
		int max;

		if (a < b) {
			min1 = a;
		} else {
			min1 = b;
		}

		if (c < d) {
			min2 = c;
		} else {
			min2 = d;
		}

		if (min1 > min2) {
			max = min1;
			System.out.println(max);
		} else if (min2 > min1) {
			max = min2;
			System.out.println(max);
		} else {
			System.out.println("Equal");
		}
	}

}
