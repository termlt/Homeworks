package Homework.collections;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);


        int[] new_ar = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arrayList.addAll(new_ar)));
    }
}
