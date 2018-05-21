package geekbrains.lesson1.HomeWork;

public class Main {

	public static void main(String[] args) {

		int a = 2;
		int b = 2;
		int c = -5;
		int d = 5;
		String e = "Антон";
			System.out.println("Решение = " + a * (b + (c / d)));
		if (c + d <= 20 && c + d >= 10)
			System.out.println("true");
		else
			System.out.println("false");
		if (c < 0)
			System.out.println("Отрицательное");
		else
			System.out.println("Положительное");
		    System.out.println("Привет, " + e);
		    System.out.println("Задание 4 = " + bolshe(a,c)); // никак не получается вызвать метод, извне метода main
	}
		public static int bolshe (int c, int d){
		 	if (c + d <= 20 && c + d >= 10)
				System.out.println("true");
			else
				System.out.println("false");
			return c;
		}
}


