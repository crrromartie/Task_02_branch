package by.htp.les04.branch;

public class Task26 {

	public static void task() {
		int a = 20;
		int b = 30;
		int c = 10;
		int max;
		int min;

		if (a > b && a > c) {
			max = a;
		} else if (b > a && b > c) {
			max = b;
		} else {
			max = c;
		}

		if (a < b && a < c) {
			min = a;
		} else if (b < a && b < c) {
			min = b;
		} else {
			min = c;
		}

		int sum = max + min;

		System.out.println("Sum = " + sum);

	}

}
