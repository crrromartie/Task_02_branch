package by.htp.les04.branch;

public class Task28 {

	public static void task() {
		int a = 4;
		int b = 9;
		int c = 7;
		int d = 8;
		int max = 0;

		if (a == d) {
			System.out.println("à equal d");
		}

		if (b == d) {
			System.out.println("b equal d");
		}

		if (c == d) {
			System.out.println("c equal d");
		}

		if (a != d && b != d && c != d) {
			if (d - a > d - b && d - a > d - c) {
				max = d - a;
				System.out.println("d - a (max) = " + max);
			} else if (d - b > d - a && d - b > d - c) {
				max = d - b;
				System.out.println("d - b (max) = " + max);
			} else {
				max = d - c;
				System.out.println("d - c (max) = " + max);
			}
		}

	}

}
