package Homework.map;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class HashMap <K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    private int capacity;
    private final double loadFactor;
    private int size;
    private List<LinkedList<Entry<K, V>>> buckets;

    public HashMap() {
        this(DEFAULT_CAPACITY);
    }

    public HashMap(int capacity) {
        this(capacity, LOAD_FACTOR);
    }

    public HashMap(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.size = 0;
        this.buckets = new ArrayList<>(capacity);

        for (int i = 0; i < capacity; i++) {
            buckets.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {     // putAll() ??? //
        if (size >= capacity * loadFactor) {
            resize();
        }

        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets.get(index);

        if (bucket == null) {
            bucket = new LinkedList<>();
            buckets.set(index, bucket);
        }

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        bucket.add(new Entry<>(key, value));
        size++;
    }

    public void resize() {
        capacity = capacity * 2;

        List<LinkedList<Entry<K, V>>> newBuckets = new ArrayList<>(capacity);

        for (int i = 0; i < capacity; i++) {
            newBuckets.add(new LinkedList<>());
        }


        for (LinkedList<Entry<K, V>> bucket : buckets) {
            for (Entry<K, V> entry : bucket) {
                int index = getIndex(entry.getKey());
                LinkedList<Entry<K, V>> newBucket = newBuckets.get(index);
                newBucket.add(entry);
            }
        }

        buckets = newBuckets;
    }

    public int getIndex(K key) {
        int hashCode = key.hashCode();
        return hashCode % capacity;
    }

    public void replace(K key, V oldValue, V newValue) {
        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets.get(index);


        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key) && entry.getValue().equals(oldValue)) {
                entry.setValue(newValue);
                return;
            }
        }
    }

    public ArrayList<K> keySet() {
        ArrayList<K> keys = new ArrayList<K>();

        for (LinkedList<Entry<K, V>> bucket : buckets) {
            for (Entry<K, V> entry : bucket) {
                keys.add(entry.getKey());
            }
        }

        return keys;
    }

    public void clear() {
        buckets.clear();
        size = 0;
    }

    public void remove(K key) {
        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets.get(index);

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets.get(index);

        V result = null;

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                result = entry.getValue();
            }
        }

        return result;
    }

    public boolean containsKey(K key) {
        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets.get(index);

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return true;
            }
        }

        return false;
    }

    public boolean containsValue(V value) {
        for (LinkedList<Entry<K, V>> bucket : buckets) {
            for (Entry<K, V> entry : bucket) {
                if (entry.getValue().equals(value)) {
                    return true;
                }
            }
        }

        return false;
    }

    public ArrayList<V> values() {
        ArrayList<V> result = new ArrayList<>();

        for (LinkedList<Entry<K, V>> bucket : buckets) {
            for (Entry<K, V> entry : bucket) {
                result.add(entry.getValue());
            }
        }

        return result;
    }
}
