package by.htp.les04.branch;

import java.util.Scanner;

public class Task23 {

	public static void task() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.print("Input day [1 .. 31]\n");
		int x = in.nextInt();
		while (x < 1 || x > 31) {
			System.out.println("Incorrect input, try again [1 .. 31]");
			x = in.nextInt();
		}

		System.out.print("Input month [1 .. 12]\n");
		int y = in.nextInt();
		while (y < 1 || y > 12) {
			System.out.println("Incorrect input, try again [1 .. 12]");
			y = in.nextInt();
		}

		System.out.println("Day: " + x + " Month: " + y);

	}

}
