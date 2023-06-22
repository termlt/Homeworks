package Homework.map;

public class test {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "First");
        hashMap.put(2, "Second");
        hashMap.put(3, "Third");

        System.out.println(hashMap.values());
    }
}
