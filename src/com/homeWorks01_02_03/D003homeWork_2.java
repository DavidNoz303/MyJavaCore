package com.homeWorks01_02_03;
import java.util.Objects;
import java.util.Scanner;

public class D003homeWork_2 {
    //Exercise number 2:
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                          "avocado", "broccoli", "carrot", "cherry", "garlic",
                          "grape", "melon", "leak", "kiwi", "mango",
                          "mushroom", "nut", "olive", "pea", "peanut",
                          "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String selectedWord = words[(int)Math.floor(Math.random()*words.length)];

        System.out.println("You have to guess a word!\nThe word is one of the following words in this list : ");
        System.out.println();
        for (int i = 1; i < words.length; i++) {
            System.out.println(i+") " + words[i] + ".");
        }
        System.out.println();

        String myGuess;
        StringBuilder lettersInPlace;

        do {
            System.out.println("What is the word ?\nIt is your time to guess.");
            myGuess = in.nextLine();
            System.out.println();
            if (Objects.equals(myGuess, selectedWord)) {
                System.out.println("Correct!");
            } else {
                lettersInPlace = new StringBuilder("###############");
                int shortestWordLength;
                if (selectedWord.length() < myGuess.length()) {
                    shortestWordLength = selectedWord.length();
                } else {
                    shortestWordLength = myGuess.length();
                }
                for (int i = 0; i < shortestWordLength; i++){
                    if (myGuess.charAt(i) == selectedWord.charAt(i)) {
                        lettersInPlace.setCharAt(i, myGuess.charAt(i));
                    }
                }
                System.out.println("Wrong! But maybe you have guessed the following letters of the word:");
                System.out.println(lettersInPlace);
                System.out.println();
                System.out.println("Now, try again!");
                System.out.println();
            }
        } while (!Objects.equals(myGuess, selectedWord));


    }
}
