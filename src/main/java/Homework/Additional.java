package Homework;

import java.util.Scanner;

public class Additional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        int[] result = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }


        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                result[0] = nums[0];
                result[i] = result[j] + nums[i];
            }
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.println(result[i]);
        }
    }
}
