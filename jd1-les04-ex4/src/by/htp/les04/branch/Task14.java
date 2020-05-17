package by.htp.les04.branch;

public class Task14 {

	public static void task() {
		int angleA = 3600;
		int angleB = 60;

		if ((angleA + angleB) < 180) {
			System.out.println("Triangle exists");
			if ((angleA + angleB) == 90) {
				System.out.println("Triangle rectangular");
			} else {
				System.out.println("Triangle is not rectangular");
			}
		} else {
			System.out.println("Triangle is not exists");
			return;
		}
	}

}
