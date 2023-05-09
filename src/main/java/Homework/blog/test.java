package Homework.blog;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        PostStorage postStorage = new PostStorage();

        System.out.println("Choose an option: ");
        int number = 1;
        for (Commands i : Commands.values()) {
            System.out.println(Integer.toString(number) + ". " + i);
            number++;
        }
        number = 1;

        Scanner sc = new Scanner(System.in);

        int result = sc.nextInt();

        while (result != 8){

            if (result == 1) { // Add post
                System.out.println("Title: ");
                String title = sc.next();
                title = title + sc.nextLine();
                System.out.println("Text: ");
                String text = sc.next();
                text = text + sc.nextLine();


                String category = null;
                while (category == null) {
                    System.out.println("Category " + Arrays.toString(Categories.values()) + ": ");
                    String c = sc.nextLine();

                    for (Categories i : Categories.values()) {
                        if (c.equalsIgnoreCase(i.toString())) {
                            category = c;
                            break;
                        }
                    }
                }

                postStorage.add(new Post(title, text, category.toUpperCase(), new Date()));
            }

            if (result == 2) {  // Search post
                if (postStorage.size == 0) {
                    System.out.println("No posts yet.");
                } else {
                    System.out.println("Enter title: ");
                    String titleToSearch = sc.next();
                    titleToSearch = titleToSearch + sc.nextLine();

                    for (int i = 0; i < postStorage.size; i++) {
                        if (postStorage.posts[i].getTitle().equalsIgnoreCase(titleToSearch)) {
                            System.out.println(postStorage.posts[i].toString());
                        }
                        break;
                    }
                }
            }

            if (result == 3) {  // Post by category
                if (postStorage.size == 0) {
                    System.out.println("No posts yet.");
                } else {
                    System.out.println("Enter desired category " + Arrays.toString(Categories.values()) + ": ");
                    String categoryToSearch = sc.nextLine();
                    categoryToSearch = categoryToSearch + sc.nextLine();

                    for (int i = 0; i < postStorage.size; i++) {
                        if (postStorage.posts[i].getCategory().equalsIgnoreCase(categoryToSearch)) {
                            System.out.println(postStorage.posts[i].toString());
                        }
                        break;
                    }
                }
            }

            if (result == 4) {  // All posts
                for (int i = 0; i < postStorage.size; i++) {
                    System.out.println(postStorage.posts[i].toString());
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
                    String titleToChange = sc.next();
                    titleToChange = titleToChange + sc.nextLine();

                    for (int i = 0; i < postStorage.size; i++) {
                        if (postStorage.posts[i].getTitle().equalsIgnoreCase(titleToChange)) {
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
                                    while (category == null) {
                                        System.out.println("Enter new category " + Arrays.toString(Categories.values()) + ": ");
                                        String newCategory = sc.nextLine().trim();

                                        for (Categories categories : Categories.values()) {
                                            if (newCategory.equalsIgnoreCase(categories.toString())) {
                                                category = newCategory;
                                                break;
                                            }
                                        }
                                    }

                                    postStorage.posts[i].setCategory(category.toUpperCase());
                            }
                        }
                        break;
                    }
                }
            }

            if (result == 7) {  // Delete by category
                if (postStorage.size == 0) {
                    System.out.println("No posts yet.");
                } else {
                    System.out.println("Enter category to delete " + Arrays.toString(Categories.values()) + ": ");
                    String categoryToDelete = sc.nextLine();
                    categoryToDelete = categoryToDelete + sc.nextLine();


                    int sizeToRemove = 0;
                    for (int i = 0; i < postStorage.size; i++) {
                        if (postStorage.posts[i].getCategory().equalsIgnoreCase(categoryToDelete)) {
                            sizeToRemove++;
                        }
                    }

                    Post[] newArray = new Post[postStorage.size - sizeToRemove];
                    int j = 0;
                    for (int i = 0; i < postStorage.size; i++) {
                        if (!postStorage.posts[i].getCategory().equalsIgnoreCase(categoryToDelete)) {
                            newArray[j] = postStorage.posts[i];
                            j++;
                        }
                    }

                    postStorage.posts = newArray;
                    postStorage.size = postStorage.size - sizeToRemove;
                }
            }

            System.out.println("Choose an option: ");
            for (Commands i : Commands.values()) {
                System.out.println(Integer.toString(number) + ". " + i);
                number++;
            }
            number = 1;
            result = sc.nextInt();
        }

        sc.close(); // Closing Scanner
    }
}
