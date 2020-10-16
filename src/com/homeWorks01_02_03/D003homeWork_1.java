package com.homeWorks01_02_03;

import java.util.Random;
import java.util.Scanner;

public class D003homeWork_1 {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Exercise Number 1 :
        Random random = new Random();
        int counter, guess, number;
        do {
            counter = 0;
            guess = -1;
            number = random.nextInt(10);
            while (counter < 3 && guess != number) {
                System.out.print("Guess the number from 0 to 9.");
                guess = scanner.nextInt();
                System.out.println();
                if (guess != number) {
                    if (guess > number) {
                        System.out.println("The guessed number is lower !");
                    } else if (guess < number) {
                        System.out.println("The guessed number is higher !");
                    }
                    counter++;
                }
            }
            if (guess == number) {
                System.out.println("You WON!");
            } else {
                System.out.println("You LOST! The right number was : " +number);
            }
            System.out.println("Repeat game ? Yes - 1, No - 0");
            System.out.println();
        } while (scanner.nextInt() == 1);
    }
}
