import java.util.Random;
import java.util.Scanner;
 
public class Main  {
  public static Scanner sc = new Scanner(System.in);

	public static void main(String args[]){
	Random rand = new Random();
  int a = rand.nextInt (10);
  System.out.println(a);
  
  int d;
  
  do {
    d = num ("Введите число от 0 до 9", 0, 9);
    System.out.println("Вы ввели число = " + d);

    if (d == a) System.out.println("Угадал");
    else if (d < a) System.out.println("Неверно, Загаданное число больше");
    else if (d > a) System.out.println("Неверно, Загаданное число меньше");
    else System.out.println("не Угадал");
  }
  while (d != a);
  
}

  public static int num (String massage, int min, int max){
    int x;
    do {
      System.out.println(massage);
      x = sc.nextInt();    
    }
    while (x < min || x > max);
    return x;
  }


}
