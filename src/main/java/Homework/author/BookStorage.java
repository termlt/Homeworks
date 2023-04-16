package Homework.author;

public class BookStorage {
    Book[] books = new Book[5];
    int size = 0;

    public void ensureCapacity() {
        if (size == books.length) {
            Book[] newArray = new Book[size * 2];

            for (int i = 0; i < size; i++) {
                newArray[i] = books[i];
            }

            books = newArray;
        }
    }

    public void addBook(Book book) {
        ensureCapacity();
        books[size] = book;
        size++;
    }

    public void getBook(int index) {
        if (index < size) {
            System.out.println("Title: " + books[index].getTitle() + "\n" + "Description: " +
                    books[index].getDescription() + "\n" + "Author email: " +
                    books[index].getAuthorEmail() + "\n" + "Price: " + books[index].getPrice() +
                    "\n" + "Count: " + books[index].getCount());
        }
    }

    public void getBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println("Title: " + books[i].getTitle() + "\n" + "Description: " +
                    books[i].getDescription() + "\n" + "Author email: " +
                    books[i].getAuthorEmail() + "\n" + "Price: " + books[i].getPrice() +
                    "\n" + "Count: " + books[i].getCount());
            System.out.println();
        }
    }

    public void printRange(int min, int max) {
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() >= min && books[i].getPrice() <= max) {
                System.out.println("Title: " + books[i].getTitle() + "\n" + "Description: " +
                        books[i].getDescription() + "\n" + "Author email: " +
                        books[i].getAuthorEmail() + "\n" + "Price: " + books[i].getPrice() +
                        "\n" + "Count: " + books[i].getCount());
                System.out.println();
            }
        }
    }

    public boolean existsAuthor(String authorEmail) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthorEmail().equalsIgnoreCase(authorEmail)) {
                result = true;
            }
        }

        return result;
    }

    public boolean existsTitle(String title) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                result = true;
            }
        }

        return result;
    }

}
