package Homework.author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        AuthorStorage authorStorage = new AuthorStorage();

        System.out.print("Authors amount to add: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        for (int i = 0; i < amount; i++) {
            Author author = new Author();
            sc.nextLine();

            System.out.print("\nName: ");
            String name = sc.nextLine();
            author.setName(name);

            System.out.print("Surname: ");
            String surname = sc.nextLine();
            author.setSurname(surname);

            System.out.print("Email: ");
            String email = sc.next();
            author.setEmail(email);

            System.out.print("Age: ");
            int age = sc.nextInt();
            author.setAge(age);

            System.out.print("Gender: ");
            Gender gender = Gender.valueOf(sc.next().toUpperCase());
            author.setGender(gender);

            authorStorage.addAuthor(author);
        }

        authorStorage.print();

        for (int i = 0; i < authorStorage.size; i++) {
            System.out.println(authorStorage.authors[i].Hashcode());
        }

//        Author a = new Author();
//        Author b = new Author();
//        System.out.println(a.Equals(b));
    }
}