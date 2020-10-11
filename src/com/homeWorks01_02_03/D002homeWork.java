package com.homeWorks01_02_03;

public class D002homeWork {
    public static void main(String[] args) {

        /* --- Exercise number 1 --- */
        invertArray();

        /* --- Exercise number 2 --- */
        fillArray();

        /* --- Exercise number 3 --- */
        changeArray();

        /* --- Exercise number 4 --- */
        fillDiagonal();

        /* --- Exercise number 5 --- */
        maxAndMin();

        /* --- Exercise number 6 --- */
        System.out.println("Exercise №6:" + "\n" + sumOfSides((new int[] { 1, 1, 1, 2, 1 })));
        System.out.println(sumOfSides((new int[] { 1, 1, 3, 2, 1 })));
        System.out.println();

        /* --- Exercise number 7 --- */
        int arr[] = {1,2,3,4,5};
        modifyArray(arr, 2);
    }


    /* --- Exercise number 1 --- */
    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        System.out.println("Exercise №1: ");
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 1:
                    arr[i] = 0;
                    break;
                case 0:
                    arr[i] = 1;
                    break;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }


    /* --- Exercise number 2 --- */
    public static void fillArray() {
        System.out.println("Exercise №2:");
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] += i * 3;
            System.out.println("Number " + (i+1) + ": " + arr[i]);
        }
        System.out.println();
    }


    /* --- Exercise number 3 --- */
    public static void changeArray() {
        System.out.println("Exercise №3:");
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
                System.out.println("Number " + (i+1) + " : " + w[i]);
            } else if (w[i] > 6) {
                System.out.println("Number " + (i+1) + " : " +"Number that higher than 6 : " + w[i]);
            }
        }
        System.out.println();
    }

    /* --- Exercise number 4 --- */
    public static void fillDiagonal() {
        System.out.println("Exercise №4:");
        int [][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                    System.out.println(arr[i][j]);
                }
            }
        }
        System.out.println();
    }

    /* --- Exercise number 5 --- */
    public static void maxAndMin() {
        System.out.println("Exercise №5:");
        int[] arr = {25, 5, 6, 12, 8, 34, 55, 4, 8, 9};
        int max = arr[0];
        int min = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max number : " + max);
        System.out.println("Min number : " + min);
        System.out.println();
    }

    /* --- Exercise number 6 --- */
    public static boolean sumOfSides(int[] arr) {
        int leftSum = 0; int rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum = 0; rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (rightSum == leftSum) {
                return true;
            }
        }
        return false;
    }
    /* --- Exercise number 7 --- */
    public static void modifyArray(int[] arr, int n) {
        System.out.println("Exercise №7:");
        System.out.print("BEFORE: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("(n = " + n + ")");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                // Moving to the right side.
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                // Moving to the left side.
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }

        System.out.print("\nAFTER:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


}

