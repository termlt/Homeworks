package Homework.author;

public class AuthorStorage {
    Author[] authors;

    public AuthorStorage(int size) {
        authors = new Author[size];
    }

    public void print() {
        for (Author author : authors) {
            System.out.println(author.getName() + " " + author.getSurname() + " " +
                " " + author.getEmail() + " " + author.getAge() + " " + author.getGender());
        }
    }

}
