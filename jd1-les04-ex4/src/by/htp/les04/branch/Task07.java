package by.htp.les04.branch;

public class Task07 {

	public static void task() {
		double a = 0.5;
		double b = 3.0;
		double c = -14.0;
		double x = 2.0;
		double y = a * Math.pow(x, 2) + b * x + c;
		System.out.println(y);
		double rez = Math.abs(y);
		System.out.println("ABS Rez  = " + rez);

	}

}
