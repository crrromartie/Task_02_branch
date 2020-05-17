package by.htp.les04.branch;

public class Task35 {

	public static void task() {
		int x = 305;
		if (x >= 1 && x <= 31) {
			System.out.println("Janury, day - " + x);
		} else if (x >= 32 && x <= 59) {
			System.out.println("February, day - " + (x - 31));
		} else if (x >= 60 && x <= 90) {
			System.out.println("March, day - " + (x - 59));
		} else if (x >= 91 && x <= 120) {
			System.out.println("April, day - " + (x - 90));
		} else if (x >= 121 && x <= 151) {
			System.out.println("May, day - " + (x - 120));
		} else if (x >= 152 && x <= 181) {
			System.out.println("June, day - " + (x - 151));
		} else if (x >= 182 && x <= 212) {
			System.out.println("July, day - " + (x - 181));
		} else if (x >= 213 && x <= 243) {
			System.out.println("August, day - " + (x - 212));
		} else if (x >= 244 && x <= 273) {
			System.out.println("September, day - " + (x - 243));
		} else if (x >= 274 && x <= 304) {
			System.out.println("October, day - " + (x - 273));
		} else if (x >= 305 && x <= 334) {
			System.out.println("November, day - " + (x - 304));
		} else if (x >= 335 && x <= 365) {
			System.out.println("December, day - " + (x - 334));
		} else {
			System.out.println("Incorrect input [1 .. 365]");
		}

	}

}
