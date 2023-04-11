package Homework.author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many authors do you want to add: ");
        int authorAmount = sc.nextInt();
        AuthorStorage as = new AuthorStorage(authorAmount);


        String name;
        String surname;
        String email;
        int age;
        Gender gender;


        for (int i = 0; i < authorAmount; i++) {
            System.out.print("Enter name: ");
            name = sc.next();
            System.out.println();

            System.out.print("Enter surname: ");
            surname = sc.next();
            System.out.println();

            System.out.print("Enter email: ");
            email = sc.next();
            System.out.println();

            System.out.print("Enter age: ");
            age = sc.nextInt();
            System.out.println();

            System.out.print("Enter gender: ");
            gender = Gender.valueOf(sc.next().toUpperCase());
            System.out.println();

            Author author = new Author(name, surname, email, age, gender);
            as.authors[i] = author;
        }

        as.print();

    }
}