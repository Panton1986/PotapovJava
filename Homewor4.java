import java.util.Random;
import java.util.Scanner;

public class Main  {
  public static Scanner sc = new Scanner(System.in);
  public static Random rand = new Random();
  public static char [][] map;
  public static final int SIZE = 3;
  public static final int DOTS_TO_WIN = 3;
  public static final char DOT_EMPTY = '*';
  public static final char DOT_X = 'X';
  public static final char DOT_O = 'O';

  public static void main(String args[]){
    initMap();
    printMap();
    while (true){
      humanTurn();
      printMap();
      if (checkWin(DOT_X)) {
        System.out.println("Вы победили");
        break;
      }
      if (isMapFull()){
        System.out.println("Ничья");
        break;
      }
      compTurn();
      printMap();
      if (checkWin(DOT_O)){
        System.out.println("Комп победил");
        break;
      }
      if (isMapFull()){
        System.out.println("Ничья");
        break;
      }
    } 
    System.out.println("Игра закончена");
  }    
    
    public static void initMap(){
      map = new char [SIZE][SIZE];
      for (int i = 0; i < SIZE; i++){
        for (int j = 0; j< SIZE; j++){
          map[i][j] = DOT_EMPTY;
        }
      }
    }
    public static void printMap(){
      for (int i = 0; i <= SIZE; i++) {
        System.out.print(i + " ");
      }
     System.out.println();
      for (int i = 0; i < SIZE; i++) {
        System.out.print((i + 1) + " ");
        for (int j = 0; j < SIZE; j++) {
        System.out.print(map[i][j] + " " );
        }
      System.out.println();
      }
    System.out.println();
    } 
    public static void humanTurn(){
      int x,y;
      do{
        System.out.println("Введите координаты X Y");
        x = sc.nextInt()-1;
        y = sc.nextInt()-1;
      } while (!isCellValid(x,y));
      map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y){
      if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
      if (map[y][x] == DOT_EMPTY) return true;
      return false;
    }
    public static void compTurn(){
      int x,y;
      do{
        System.out.println("Компьютер ходит");
        x = rand.nextInt(SIZE);
        y = rand.nextInt(SIZE);
      } while (!isCellValid(x,y));
      System.out.println("Сделан ход в точку " + (x+1) + " " + (y+1));
      map[y][x] = DOT_O;
    }
    public static boolean checkWin(char symb) {
        int rowCount = 0;
        int columnCount = 0;
          for (int i = 0; i < SIZE; i++) {
            for (int g = 0; g < SIZE - DOTS_TO_WIN + 1; g++) {
                for (int j = 0; j < DOTS_TO_WIN; j++) {                    
                    if (map[i][j + g] == symb) {
                        rowCount++;
                        if (rowCount == DOTS_TO_WIN) return true;
                    } else {
                        rowCount = 0;
                    }
                    
                    if (map[j + g][i] == symb) {
                        columnCount++;
                        if (columnCount == DOTS_TO_WIN) return true;
                    } else {
                        columnCount = 0;
                    }
                }
                rowCount = 0;
                columnCount = 0;
            }
        }

        int basicDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < SIZE - DOTS_TO_WIN + 1; i++) {
            for (int g = 0; g < SIZE - DOTS_TO_WIN + 1; g++) {
                for (int j = 0; j < DOTS_TO_WIN; j++) {
                    
                    if (map[i + j][g + j] == symb) {
                        basicDiagonal++;
                        if (basicDiagonal == DOTS_TO_WIN) return true;
                    } else {
                        basicDiagonal = 0;
                    }
                    
                    if (map[i + DOTS_TO_WIN - 1 - j][g + j] == symb) {
                        secondaryDiagonal++;
                        if (secondaryDiagonal == DOTS_TO_WIN) return true;
                    } else {
                        secondaryDiagonal = 0;
                    }
                }
                basicDiagonal = 0;
                secondaryDiagonal = 0;
            }
        }

        return false;
    }



    public static boolean isMapFull(){
      for (int i = 0; i < SIZE; i++){
        for (int j = 0; j < SIZE; j++){
          if (map[i][j] == DOT_EMPTY) return false;
        }
      }
      return true;
    }
}
