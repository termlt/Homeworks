package Homework.blog;

import java.util.Date;

public class Post {
    private String title, text, category;
    private Date createdDate;

    public Post(){}

    public Post(String title, String text, String category, Date createdDate) {
        this.title = title;
        this.text = text;
        this.category = category;
        this.createdDate = createdDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Post {" +
                "title = '" + title + '\'' +
                ", text = '" + text + '\'' +
                ", category = '" + category + '\'' +
                ", createdDate = " + createdDate +
                '}';
    }
}
