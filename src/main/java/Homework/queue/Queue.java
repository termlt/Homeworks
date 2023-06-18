package Homework.queue;

public class Queue {
    public int[] array;
    private int first;
    private int last;
    private int size;

    public Queue(int capacity) {
        array = new int[capacity];
        first = last = -1;
        size = 0;
    }

    public void add(int element) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }

        last = last + 1;
        array[last] = element;
        size++;
    }

    public int remove() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        first = first + 1;
        int element = array[first];
        array[first] = 0;
        size--;

        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == array.length;
    }

    public int size() {
        return size;
    }
}
