package Homework.collections;

public class ArrayList {
    int[] array = new int[8];
    int size = 0;

    public void ensureCapacity() {
        if (size == array.length) {
            int[] newArray = new int[size + 1];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }

            array = newArray;
        }
    }


    public void add(int element) {
        ensureCapacity();
        array[size] = element;
        size++;
    }


    public void add(int index, int element) {
        ensureCapacity();
        int[] newArray = new int[size+1];

        int j = 0;
        for (int i = 0; i < index; i++) {
            newArray[j] = array[j];
            j++;
        }

        int k = index;
        for (int i = size; i > index; i--) {
            newArray[k+1] = array[k];
            k++;
        }

        newArray[index] = element;

        array = newArray;
        size++;
    }


    public void addAll(int[] array) {
        for (int i : array) {
            add(i);
        }
    }

    public void removeAll() {
        array = new int[0];
        size = 0;
    }


    public void removeElementOfIndex(int index) {
        int[] newArray = new int[size-1];
        int j = 0;

        for (int i = 0; i < size; i++) {
            if (i != index) {
                newArray[j] = array[i];
                j++;
            }
        }

        array = newArray;
        size--;
    }


    public void removeElement(int element) {
        int[] newArray = new int[size-1];
        int j = 0;

        for (int i : array) {
            if (i != element) {
                newArray[j] = i;
                j++;
            }
        }

        array = newArray;
        size--;
    }


    public int getElement(int index) {
        return array[index];
    }


    public int getIndex(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return -1;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public int size() {
        return size;
    }


    public int[] clone() {
        return array;
    }


    public int[] subList(int start, int end) {
        int[] newArray = new int[end-start+1];
        int j = 0;

        for (int i = start; i <= end; i++) {
            newArray[j] = array[i];
            j++;
        }

        return newArray;
    }


    public void print() {
        for (int i : array) {
            System.out.println(i);
        }
    }


    //Additional
    public void reverse() {
        int[] newArray = new int[size];
        int j = 0;

        for (int i = size-1; i >= 0; i--) {
            newArray[j] = array[i];
            j++;
        }

        array = newArray;
    }
}
