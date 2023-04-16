package Homework.author;

public class Author {
    private String name, surname, email;
    private int age;
    private Gender gender;

    public Author(){}

    public Author(String name, String surname, String email, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Name: " + getName() + "\n" + "Surname: " + getSurname() + "\n"
                + "Email: " + getEmail() + "\n" + "Age: " + getAge() + "\n" +
                "Gender: " +  getGender();
    }

//    public boolean Equals(Object a) {
//        Author author = new Author();
//        return a.equals(author);
//    }

    public int Hashcode() {
        int result = 1;
        for (int i = 0; i < this.getSurname().length(); i++) {
            result  = (result + i) * 7;
            for (int j = 0; j < this.getEmail().length(); j++) {
                result = (3 + j) * 213 * age;
            }
        }

        return result;
    }
}