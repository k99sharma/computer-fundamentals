package Encapsulation;

/**
 * Person class
 *
 * Person class have two attributes 'name' and 'age'. We declared setter and getter methods to set and get attributes values.
 * Encapsulated classes need to be static otherwise it will defeat the purpose of encapsulation.
 * If a class is declared 'static' it means the class and its members can be accessed without creating an object of the class.
 * Since, static fields and members are shared across all instances of class, making them private would defeat the purpose of making them static.
 * 'static' fields and methods are often declared as 'public' or 'protected'.
 */

public class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }
}
