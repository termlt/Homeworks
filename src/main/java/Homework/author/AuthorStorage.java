package Homework.author;

public class AuthorStorage {
    Author[] authors = new Author[5];
    int size = 0;

    public void ensureCapacity() {
        if (size == authors.length) {
            Author[] newArray = new Author[size * 2];

            for (int i = 0; i < size; i++) {
                newArray[i] = authors[i];
            }

            authors = newArray;
        }
    }

    public void addAuthor(Author author) {
        ensureCapacity();
        authors[size] = author;
        size++;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }
}