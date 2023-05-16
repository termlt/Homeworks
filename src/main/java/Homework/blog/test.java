package Homework.blog;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class test {
    static PostStorage postStorage = new PostStorage();
    static Scanner sc = new Scanner(System.in);
    static int number = 1;
    static int result;

    public static void main(String[] args) {
        printMethods();

        while (result != 8) {

            if (result == 1) { // Add post
                addPost();
                }

            if (result == 2) {  // Search post
                if (postStorage.size == 0) {
                    System.out.println("No posts yet.");
                } else {
                    System.out.println("Enter title: ");
                    String title = sc.next();
                    title = title + sc.nextLine();
                    searchPost(title);
                    }
                }

            if (result == 3) {  // Post by category
                if (postStorage.size == 0) {
                    System.out.println("No posts yet.");
                } else {
                    System.out.println("Enter desired category " + Arrays.toString(Categories.values()) + ": ");
                    String category = sc.nextLine();
                    category = category + sc.nextLine();
                    postByCategory(category);
                    }
                }

                if (result == 4) {  // All posts
                    if (postStorage.size == 0) {
                        System.out.println("No posts yet.");
                    } else {
                        for (int i = 0; i < postStorage.size; i++) {
                            System.out.println(postStorage.posts[i].toString());
                        }
                    }
                }

                if (result == 5) {  // Delete post
                    if (postStorage.size == 0) {
                        System.out.println("No posts yet.");
                    } else {
                        System.out.println("Enter title: ");
                        String titleToDelete = sc.next();
                        titleToDelete = titleToDelete + sc.nextLine();

                        postStorage.deletePost(titleToDelete);
                    }
                }

                if (result == 6) {  // Change post
                    if (postStorage.size == 0) {
                        System.out.println("No posts yet.");
                    } else {
                        System.out.println("Enter title: ");
                        String title = sc.next();
                        title = title + sc.nextLine();
                        changePost(title);
                    }
                }

                if (result == 7) {  // Delete by category
                    if (postStorage.size == 0) {
                        System.out.println("No posts yet.");
                    } else {
                        System.out.println("Enter category to delete " + Arrays.toString(Categories.values()) + ": ");
                        String category = sc.nextLine();
                        category = category + sc.nextLine();
                        deleteByCategory(category);
                }
            }

            System.out.println("Choose an option: ");
            for (Commands i : Commands.values()) {
                System.out.println(number + ". " + i);
                number++;
            }
            number = 1;
            result = sc.nextInt();
            //sc.close(); // Closing Scanner
        }
    }

    static void addPost() { // Add post
        //Scanner sc = new Scanner(System.in);
        System.out.println("Title: ");
        String title = sc.next();

        if (sc.hasNextLine()) {
            title = title + sc.nextLine();
        } else {
            System.out.println("Please enter a title.");
            return;
        }

        System.out.println("Text: ");
        String text = sc.next();

        if (sc.hasNextLine()) {
            text = text + sc.nextLine();
        } else {
            System.out.println("Please enter some text.");
            return;
        }


        String category = "home";
        System.out.println("Category " + Arrays.toString(Categories.values()) + ": ");
        String c = sc.next();

        for (Categories i : Categories.values()) {
            if (c.equalsIgnoreCase(i.toString())) {
                category = c;
                break;
            }
        }

        sc.nextLine();

        postStorage.add(new Post(title, text, category.toUpperCase(), new Date()));
    }

    static void searchPost(String title) { // Search post
        PostStorage postStorage = new PostStorage();

        for (int i = 0; i < postStorage.size; i++) {
            if (postStorage.posts[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println(postStorage.posts[i].toString());
                return;
            }

            System.out.println("Post not found");
        }
    }

    static void postByCategory(String category) { // Get post by category
        for (int i = 0; i < postStorage.size; i++) {
            if (postStorage.posts[i].getCategory().equalsIgnoreCase(category)) {
                System.out.println(postStorage.posts[i].toString());
            }
            break;
        }
    }

    static void changePost(String title) { // Change post
        for (int i = 0; i < postStorage.size; i++) {
            if (postStorage.posts[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("""
                                        Choose an option:
                                        1. Edit text
                                        2. Edit category""");

                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Enter new text: ");
                        String newText = sc.next();
                        newText = newText + sc.nextLine();

                        postStorage.posts[i].setText(newText);

                    case 2:
                        String category = null;
                        do {
                            System.out.println("Enter new category " + Arrays.toString(Categories.values()) + ": ");
                            String newCategory = sc.next().trim();

                            for (Categories categories : Categories.values()) {
                                if (newCategory.equalsIgnoreCase(categories.toString())) {
                                    category = newCategory;
                                    break;
                                }
                            }
                        } while (category == null);

                        postStorage.posts[i].setCategory(category.toUpperCase());
                }
            }
            break;
        }
    }

    static void deleteByCategory(String category) { // Delete by category
        int sizeToRemove = 0;
        for (int i = 0; i < postStorage.size; i++) {
            if (postStorage.posts[i].getCategory().equalsIgnoreCase(category)) {
                sizeToRemove++;
            }
        }

        Post[] newArray = new Post[postStorage.size - sizeToRemove];
        int j = 0;
        for (int i = 0; i < postStorage.size; i++) {
            if (!postStorage.posts[i].getCategory().equalsIgnoreCase(category)) {
                newArray[j] = postStorage.posts[i];
                j++;
            }
        }

        postStorage.posts = newArray;
        postStorage.size = postStorage.size - sizeToRemove;
    }


    static void printMethods() {
        System.out.println("Choose an option: ");
        for (Commands i : Commands.values()) {
            System.out.println(number + ". " + i);
            number++;
        }
        number = 1;

        result = sc.nextInt();
    }
}
