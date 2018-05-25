package geekbrains.lesson3.HomeWork;

import java.util.Random;
import java.util.Scanner;

public class Main  {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
     Random rand = new Random();
        int a = rand.nextInt (10);
        System.out.println(a);

        int i = 3;
        int d;
        int c;
//        c = novayaIgra ("Хочешь сыграть 1-да, 0-нет", 0, 1);
//        if (c == 1)
            System.out.println("Попробуй угадать число от 0 до 9, есть 3 попытки");
            do {
                i--;
                System.out.println();
                d = num("Введите число от 0 до 9", 0, 9);
                System.out.println("Вы ввели число = " + d);

                if (d < a) System.out.println("Неверно, Загаданное число больше чем " + d + ", Осталось попыток: " + i);
                else if (d > a) System.out.println("Неверно, Загаданное число меньше чем " + d + ", Осталось попыток: " + i);
                else System.out.println("Угадал");
            }
            while (d != a && i > 0);
                if (d != a) System.out.println("К сожалению попытки закончились, Загаданное число = " + a);
//            System.out.print("Повторить игру?");
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
    public static int novayaIgra (String massage, int min, int max){
        int y;
        do {
            System.out.println(massage);
            y = sc.nextInt();
        }
        while (y < min || y > max);
        return y;
    }
}

