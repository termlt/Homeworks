package Homework.collections;


import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(6);
//        arrayList.add(7);
//        arrayList.add(8);
//        arrayList.add(9);
//        arrayList.add(10);
//
//      /*  int[] sublist = arrayList.subList(1, 3);//->7,8,9
//        for (int i = 0; i < sublist.length; i++) {
//            System.out.println(sublist[i]);
//        }
//
//        int[] new_ar = new int[] {1, 2, 3, 4, 5};*/
//  /*      System.out.println(Arrays.toString(arrayList.addAll(new_ar)));
//
//        System.out.println(Arrays.toString(arrayList.removeElementOfIndex(4)));*/
//
//        int[] reverse = arrayList.reverse();
//        for (int i = 0; i < reverse.length; i++) {
//            System.out.println(reverse[i]);
//        }


        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        int[] arr = new int[] {6,7,8,9,10};
        al.addAll(arr);
//        al.removeAll();
//        al.removeElement(4);

        al.reverse();
        System.out.println(Arrays.toString(al.array));

    }
}
