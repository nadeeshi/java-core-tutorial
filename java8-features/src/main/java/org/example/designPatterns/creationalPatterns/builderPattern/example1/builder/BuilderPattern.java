package org.example.designPatterns.creationalPatterns.builderPattern.example1.builder;

/**
 * Using a builder pattern, we can create a complex object by creating step by step using the correct sequence of actions.
 *
 * In this example, I created User with firstName as a mandatory field and other fields are considered as optional.
 * So, the normal process for creating these kinds of objects can create by implementing different constructors with different parameters,
 *      but then we need more constructors for that, and it will be not suitable for objects which have large attribute sets.
 *      Or even we don’t need to use several setter methods on the created object.
 *
 * To solve this kind of problem we can use the builder class which helps in building desired User instances
 * with all mandatory attributes and a combination of optional attributes.
 */
public class BuilderPattern {

    public static void main(String[] args) {
        User user1 = new UserBuilder("Ann").setLastName("Sofie")
                .setAge(23).setPhone("019203044").build();

        System.out.println(user1);

        User user2 = new UserBuilder("Jack").setLastName("Man").setAge(45).build();
        System.out.println(user2);

        // throw error User must be over 18
        User user3 = new UserBuilder("Nir").build();
        System.out.println(user3);
    }
}
