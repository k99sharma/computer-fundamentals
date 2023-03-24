package Encapsulation;

/**
 * Encapsulation Example
 *
 * We can create a fully encapsulated class in Java by making all the members of the
 * class private. And we can use getter and setter methods to set and get data.
 * Done to achieve data hiding.
 */

public class Example {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Jon Doe");
        person.setAge(19);

        System.out.println(person.getName() + " is " + person.getAge() + " years old.");
    }
}
