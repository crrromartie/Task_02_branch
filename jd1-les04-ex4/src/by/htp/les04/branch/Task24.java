package by.htp.les04.branch;

import java.util.Scanner;

public class Task24 {

	public static void task() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Input number of petal [1 .. 10]\n");
		int x = in.nextInt();
		while (x < 1 || x > 10) {
			System.out.println("Incorrect input, try again [1 .. 10]");
			x = in.nextInt();
		}

		if (x % 2 == 0) {
			System.out.println("Love!");
		} else {
			System.out.println("Not love!");
		}
	}

}
