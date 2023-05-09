package Homework.blog;

public interface IPostStorage {
    void add(Post post);
    Post getPostByTitle(String title);
    void printPostsByKeyword(String keyword);
    void printAllPosts();
    void printPostsByCategory(String category);
    void deletePost(String title);
}
