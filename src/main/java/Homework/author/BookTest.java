package Homework.author;

import java.util.Scanner;

public class BookTest{
    public static void main(String[] args) {
        BookStorage bookStorage = new BookStorage();

        System.out.print("Books amount to add: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        for (int i = 0; i < amount; i++) {
            Book book = new Book();
            sc.nextLine();

            System.out.print("\nTitle: ");
            String title = sc.nextLine();
            book.setTitle(title);

            System.out.print("Description: ");
            String description = sc.nextLine();
            book.setDescription(description);

            System.out.print("Author email: ");
            String authorEmail = sc.nextLine();
            book.setAuthorEmail(authorEmail);

            System.out.print("Price: ");
            int price = sc.nextInt();
            book.setPrice(price);

            System.out.print("Count: ");
            int count = sc.nextInt();
            book.setCount(count);

            bookStorage.addBook(book);
        }
    }
}
