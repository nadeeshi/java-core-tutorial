package org.example.designPatterns.creationalPatterns.builderPattern.example1.builder;

public class User {

    private String firstName; // required
    private String lastName; // optional
    private int age; // optional
    private String phone; // optional

    public User(String firstName, String lastName, int age, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

}
