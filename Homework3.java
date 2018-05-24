package geekbrains.lesson3.HomeWork;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

            Random rand = new Random();
            int a = rand.nextInt(10);
            System.out.println(a);

            int d = num ("Введите число от 0 до 9", 0, 9);
            System.out.println("d = " +d);
    }
        public static int num(String message, int min, int max){
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
            } while (x < min || x > max);
        return x;
        }

}
