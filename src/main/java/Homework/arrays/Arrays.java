package Homework.arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements in the array: ");
        int count = sc.nextInt();
        System.out.print("Input array: ");
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("All elements: " + printAll(array));
        System.out.println("Max value: " + printMax(array));
        System.out.println("Min value: " + printMin(array));
        System.out.println("Odd numbers amount: " + countOddNumbers(array));
        System.out.println("Even numbers amount: " + countEvenNumbers(array));
        System.out.println("Odd numbers: " + printOddNumbers(array));
        System.out.println("Even numbers: " + printEvenNumbers(array));
        System.out.println("Sum: " + printSum(array));
        System.out.println("Arithmetic mean: " + printArithmeticMean(array));
    }


    //Print all elements
    static String printAll(int[] array) {
        StringBuilder sb = new StringBuilder();

        for (int j : array) {
            sb.append(j).append('.');
        }

        return sb.toString();
    }

    //Print max value
    static int printMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //Print min value
    static int printMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //Count all odd numbers
    static int countOddNumbers(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    //Count all even numbers
    static int countEvenNumbers(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //Print odd numbers
    static String printOddNumbers(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            if (i % 2 != 0) {
                sb.append(array[i]).append('.');
            }
        }
        return sb.toString();
    }

    //Print even numbers
    static String printEvenNumbers(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sb.append(array[i]).append('.');
            }
        }
        return sb.toString();
    }

    //Print sum
    static int printSum(int[] array) {
        int sum = 0;

        for (int i : array) {
            sum += i;
        }

        return sum;
    }

    //Print arithmetic mean
    static float printArithmeticMean(int[] array) {
        int amount = 0;
        for (int ignored : array) {
            amount++;
        }
        float sum = printSum(array);
        return sum / amount;
    }
}