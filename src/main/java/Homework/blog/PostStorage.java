package Homework.blog;

public class PostStorage implements IPostStorage{
    Post[] posts = new Post[5]; // Array to keep all posts
    int size = 0;

    private void ensureCapacity() {
        if (posts.length == size) {
            Post[] newArray = new Post[size * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = posts[i];
            }

            posts = newArray;
        }
    }

    @Override
    public void add(Post post) {
        ensureCapacity();
        posts[size] = post;
        size++;
    }

    @Override
    public Post getPostByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equals(title)) {
                return posts[i];
            }
        }

        return null;
    }

    @Override
    public void printPostsByKeyword(String keyword) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getText().contains(keyword)) {
                System.out.println(posts[i].toString());
            }
        }
    }

    @Override
    public void printAllPosts() {
        for (int i = 0; i < size; i++) {
            System.out.println(posts[i].toString());
        }
    }

    @Override
    public void printPostsByCategory(String category) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getCategory().equals(category)) {
                System.out.println(posts[i].toString());
            }
        }
    }

    @Override
    public void deletePost(String title) {
        Post[] newArray = new Post[size-1];
        int j = 0;

        for (int i = 0; i < size; i++) {
            if (!posts[i].getTitle().equalsIgnoreCase(title)) {
                newArray[j] = posts[i];
                j++;
            }
        }

        posts = newArray;
        size--;
    }


}
