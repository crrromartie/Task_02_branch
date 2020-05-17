package by.htp.les04.branch;

public class Task10 {

	public static void task() {

		double r1 = 6.0;
		double r2 = 10.0;

		double s1 = Math.PI * Math.pow(r1, 2);
		double s2 = Math.PI * Math.pow(r2, 2);

		if (s1 < s2) {
			System.out.println("Square r1 = " + r1 + " less");
		} else if (s2 < s1) {
			System.out.println("Square r2 = " + r2 + " less");
		} else {
			System.out.println("Square equal");
		}

	}

}
