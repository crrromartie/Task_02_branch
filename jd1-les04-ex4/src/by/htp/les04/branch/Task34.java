package by.htp.les04.branch;

public class Task34 {

	public static void task() {
		int prise = 880;
		int money = 950;

		if (money > prise) {
			int ch = money - prise;
			System.out.println("Take the change " + ch);
		} else if (money < prise) {
			int n = prise - money;
			System.out.println("Not enough money " + n);
		} else {
			System.out.println("Thank you");
		}

	}

}
