package Homework.author;

public class Author {
    private String name, surname, email;
    private int age;
    private Gender gender;

    public Author(){}
    public Author(String name, String surname, String email, int age, Gender gender) {
        setName(name);
        setSurname(surname);
        setEmail(email);
        setAge(age);
        setGender(gender);
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }
    public Gender getGender() {
        return gender;
    }

}
