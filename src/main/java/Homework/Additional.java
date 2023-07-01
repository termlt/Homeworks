package Homework;

import java.util.Arrays;

public class Additional {
    public static void main(String[] args) {
        int[] new_array = {1, 4, 3, 2, 7, 9, 8};
        int[] new_array2 = {23, 12, 213};
        System.out.println(containSameElement(new_array, new_array2));
        System.out.println(Arrays.toString(shuffle(new_array, 100000, 0)));
    }

    public static String reverseString(String text) {
        int len = text.length();
        StringBuilder result = new StringBuilder();

        for (int i = len - 1; i >= 0; i--) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    public static String swapNums(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return "a: " + a + ", b: " + b + ".";
    }

    public static boolean containsVowel(String text) {
        boolean result = false;
        for (int i = 0; i <= text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o'
                    || letter == 'u') {
                result = true;
                break;
            }
        }

        return result;
    }


    public static int fibonacci(int number) {
        if (number <= 1) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void tryCatch() {
        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("");
        } catch (Exception e) {
            System.out.println();
        }
    }

    public static String nullP() {
        String result = null;
        try {
            result.contains("55");
            return result;
        } catch (NullPointerException e) {
            return "Got exception";
        }
    }

    public static boolean containSameElement(int[] arr1, int[] arr2) {
        boolean result = false;
        for (int k : arr1) {
            for (int i : arr2) {
                if (k == i) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }

    public static int[] shuffle(int[] arr, int number, int index) {
        int[] newArray = new int[arr.length + 1];

        /*for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = arr[i];
            } else if (i == index) {
                    newArray[i] = number;
            } else {
                    newArray[i] = arr[i];
            }*/
        //}

        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }
        newArray[index] = number;

        for (int i = index; i < arr.length; i++) {
            newArray[i+1] = arr[i];
        }

        arr = newArray;
        return arr;
    }

    public static int[] sortSortedArrays() {
        int[] firstArray = {1, 2, 20};
        int[] secondArray = {3, 5, 10};
        int[] result = new int[firstArray.length + secondArray.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] <= secondArray[j]) {
                result[k] = firstArray[i];
                i++;
            } else {
                result[k] = secondArray[j];
                j++;
            }
            k++;
        }

        while (i < firstArray.length) {
            result[k] = firstArray[i];
            i++;
            k++;
        }

        while (j < secondArray.length) {
            result[k] = secondArray[j];
            j++;
            k++;
        }

        return result;
    }

    public static void bubbleSort(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) { // [5, 3, 2, 7] -> [3, 5, 2, 7]
        int size = arr.length;

        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }
}