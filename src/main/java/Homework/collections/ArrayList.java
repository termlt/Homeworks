package Homework.collections;

public class ArrayList {
    int[] array = new int[5];
    int filledSize = 0;

    private void ensureCapacity() {
        if (filledSize >= array.length) {
            int[] newArray = new int[filledSize * 2];
            for (int i = 0; i < filledSize; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }


    public void add(int element) {
        ensureCapacity();
        array[filledSize] = element;
        filledSize++;
    }

    public void add(int element, int index) {
        if (index < array.length) {
            array[index] = element;
        }
    }


    public int[] addAll(int[] arr) {
        int[] new_array = new int[array.length + arr.length];

        int i = 0;

        for (int j : array) {
            new_array[i] = j;
            i++;
        }

        for (int j : arr) {
            new_array[i] = j;
            i++;
        }

        return new_array;
    }


    public void removeAll() {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }


    public void removeElementOfIndex(int index) {
        for (int i = index; i < filledSize - 1; i++) {
            array[i] = array[i + 1];
        }
        filledSize--;
    }


    public int[] removeElement(int element) {
        int[] new_array = new int[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) {
                new_array[j] = array[i];
                j++;
            }
        }

        return new_array;
    }


    public int getElement(int index) {
        return array[index];
    }


    public int getIndex(int element) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                result = i;
            }
        }

        return result;
    }


    public boolean isEmpty(int[] array) {
        boolean result = false;

        if (array.length == 0) {
            result = true;
        }

        return result;
    }


    public int size(){
        return filledSize;
    }


    public int[] clone(int[] array) {
        int[] new_array = array;

        return new_array;
    }


    public int[] subList(int start, int end) {
        int[] new_array = new int[end-start];
        int k = 0;

        for (int i = start; i < end; i++) {
            new_array[k] = array[i];
            k++;
        }

        return new_array;
    }


    public void print() {
        for (int i = 0; i < filledSize; i++) {
            System.out.println(array[i]);
        }
    }
}
