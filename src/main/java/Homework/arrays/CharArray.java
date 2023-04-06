package Homework.arrays;

import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char a = sc.next().charAt(0);
        char [] text = {' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', ' '};

        System.out.println(removeSpaces(text));
        System.out.println(findCount(text, a));
        System.out.println(findMidElement(text));
        System.out.println(endsLy(text));
        System.out.println(hasMiddleElement(text));

    }

    //Remove spaces
    static char[] removeSpaces(char[] array) {
        int len = array.length;

        for (int i = 0; i < len; i++) {
            if (array[i] != ' ') {
                len--;
            }
        }

        int num = 0;
        char[] result = new char[len];
        for (char i : array) {
            if (i != ' ') {
                result[num++] = i;
            }
        }

        return result;
    }

    //Find a character count
    static int findCount(char[] array, char a) {
        char[] arr = removeSpaces(array);
        int result = 0;

        for (char i : arr) {
            if (i == a) {
                result++;
            }
        }

        return result;
    }

    //Find middle element
    static char findMidElement(char[] array) {
        char[] arr = removeSpaces(array);
        int len = arr.length;

        if (len % 2 != 0) {
            len = (len / 2) + 1;
        }

        return arr[len-1];
    }

    //Check if ends with 'ly'
    static boolean endsLy(char[] array) {
        char[] arr = removeSpaces(array);
        return arr[arr.length - 1] == 'y' && arr[arr.length - 2] == 'l';
    }

    //Check if there is anything between l and l
    static boolean hasMiddleElement(char[] array) {
        char[] arr = removeSpaces(array);
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'l') {
                for (int j = i+2; j < arr.length; j++) {
                    if (arr[j] == 'l') {
                        result = true;
                        break;
                    }
                }
            }
        }

        return result;
    }
}