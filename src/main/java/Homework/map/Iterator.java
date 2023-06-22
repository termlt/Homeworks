package Homework.map;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Iterator<T> {
    private List<T> array = new ArrayList<>();
    private int current;
    private boolean removable = false;

    public Iterator(List<T> array) {
        this.array = array;
        this.current = 0;
    }

    public boolean hasNext() {
        return current < array.size();
    }

    public T next() {
        if (hasNext()) {
            T element = array.get(current);
            current++;
            removable = true;
            return element;
        } else {
            throw new NoSuchElementException("No more elements");
        }
    }

    public void remove() {
        if (removable) {
            array.remove(array.get(current));
        }
    }
}
