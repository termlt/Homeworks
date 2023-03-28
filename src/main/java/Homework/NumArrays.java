package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class NumArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements in the array: ");
        int count = sc.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(includesNum(array, num));
        System.out.println(printIndex(array, num));
        System.out.println(indexValue(array, num));
        System.out.println(findDuplicates(array));
        System.out.println(Arrays.toString(sortAscending(array)));
        System.out.println(Arrays.toString(sortDescending(array)));
    }

    //Includes number
    static boolean includesNum(int[] array, int number) {
        boolean result = false;
        for (int i : array) {
            if (i == number) {
                result = true;
                break;
            }
        }
        return result;
    }

    //Print index
    static int printIndex(int[] array, int number) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                result = i;
                break;
            }
        }
        return result;
    }

    //Find value by Index
    static int indexValue(int[] array, int number) {
        int result = -1;
        if (number < array.length) {
            result = array[number];
        }
        return result;
    }

    //Find duplicates and print them
    static String findDuplicates(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("No duplicates found.");
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    result.setLength(0);
                    result.append(array[i]).append(',');
                }
            }
        }
        return result.toString();
    }

    //Sort in ascending order
    static int[] sortAscending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    //Sort in descending order
    static int[] sortDescending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
