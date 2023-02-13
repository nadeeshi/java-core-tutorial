package org.example.designPatterns.creationalPatterns.builderPattern.example1.builder;

/**
 * Using a builder pattern, we can create a complex object by creating step by step using the correct sequence of actions.
 *
 */
public class UserBuilder {

    private String firstName; // mandatory filed
    private String lastName;
    private int age;
    private String phone;

    public UserBuilder(String firstName) {
        this.firstName = firstName;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public User build() {
        User user = new User(firstName, lastName, age, phone);
        return validateUserObject(user);
    }

    // Add some custom validations
    private User validateUserObject(User user) {
        if (user.getAge() < 18) {
            throw new IllegalArgumentException("User must be over 18");
        }

        return user;
    }
}
