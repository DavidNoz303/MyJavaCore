package lesson4;
//Website 1: for practise : https://acmp.ru/
//Website 2: for practise : https://www.codewars.com/
import java.util.Random;
import java.util.Scanner;

public class XOGame {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("You are the WINNER !!!");
                break;
            }
            if (isMapFull()) {
                System.out.println("DRAW !");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("COMPUTER IS THE WINNER !");
                break;
            }
            if (isMapFull()) {
                System.out.println("DRAW !");
                break;
            }
        }
        System.out.println("GAME OVER.");
    }
    public static boolean checkWin(char c) {
        int countV;
        int countH;
        for (int i = 0; i <= SIZE - 1; i++) {
            countH = 0;
            countV = 0;
            for (int j = 0; j <= SIZE - 1; j++) {
                //tested horizontal check
                if (map[i][j] == c) {
                    countH++;
                    if (countH == DOTS_TO_WIN) return true;
                }

                //tested vertical check
                if (map[j][i] == c) {
                    countV++;
                    if (countV == DOTS_TO_WIN) return true;
                }

            }

            //Diagonal Combos:
            if ((map[0][0] == c && map[1][1] == c && map[2][2] == c && map[3][3] == c) || (map[1][1] == c && map[2][2] == c && map[3][3] == c && map[4][4] == c)) {return true;}
            if ((map[4][0] == c && map[3][1] == c && map[2][2] == c && map[1][3] == c) || (map[3][1] == c && map[2][2] == c && map[1][3] == c && map[0][4] == c)) {return true;}
            if ((map[0][1] == c && map[1][2] == c && map[2][3] == c && map[3][4] == c) || (map[1][0] == c && map[2][1] == c && map[3][2] == c && map[4][3] == c)) {return true;}
            if ((map[3][0] == c && map[2][1] == c && map[1][2] == c && map[0][3] == c) || (map[4][1] == c && map[3][2] == c && map[2][3] == c && map[1][4] == c)) {return true;}

        }
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Computer point coordinates: " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter coordinate X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

