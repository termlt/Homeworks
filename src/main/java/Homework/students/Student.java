package Homework.students;

public class Student {
    private int id;
    private int age;
    private String name;
    private String surname;

    public Student() {
    }

    public Student(int id, int age, String name, String surname) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public Student(int id, int age, String name) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void print() {
        System.out.println("Id: " + id + " Name: " + name);
    }

}
