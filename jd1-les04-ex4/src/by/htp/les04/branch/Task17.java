package by.htp.les04.branch;

public class Task17 {

	public static void task() {
		int a = 16;
		int b = 16;

		if (a != b) {
			if (a > b) {
				b = a;
				System.out.println("A = " + a);
				System.out.println("B = " + b);
			} else {
				a = b;
				System.out.println("A = " + a);
				System.out.println("B = " + b);
			}
		} else {
			a = 0;
			b = 0;
			System.out.println("A = " + a);
			System.out.println("B = " + b);
		}
	}

}
