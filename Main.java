package geekbrains.lesson1.HomeWork;

public class Main {

	public static void main(String[] args) {
		byte aa = 10;
		short bb= 100;
		int cc = 1000;
		long dd = 10000L;
		float ee = 10.1f;
		double ff = 10.25;
		boolean gg = true;
		char hh = 'A';

		System.out.println("Задание 3 = " + calculate(2,5,5,5));
		System.out.println("Сумма между 10 и 20 " + between(4, 5));
		proverka(-2);
		System.out.println("Число отрицательное " + proverka2(-5));
		name("Антон");
	}
	private static int calculate(int a, int b, int c, int d) {
		return a * (b + (c / d));
	}
	private static boolean between (int a, int b){
		if ((a+b)<=20 && (a+b)>=10)	return true;
		else return false;
	}
	private static void proverka (int a) {
		if (a < 0) System.out.println("Отрицательное");
		else System.out.println("Положительное");
	}
	private static boolean proverka2 (int a) {
		if (a < 0) return true;
		else return false;
	}
	private static void name (String a){
		System.out.println("Привет, " +a);
	}
}


