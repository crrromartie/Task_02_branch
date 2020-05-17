package by.htp.les04.branch;

import java.util.Scanner;

public class Task21 {

	public static void task() {
		System.out.println("Who are you? Boy or girl?");

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Input B or G");
		String b = in.next();
		char a = b.charAt(b.length() - 1);

		if (a == 'B') {
			System.out.println("I like boys!");
		} else if (a == 'G') {
			System.out.println("I like girls!");
		} else {
			System.out.println("Incorrect input!");
		}

	}

}
