package Inheritance;

public class Example {
    public static class Animal{
        public void eat(){
            System.out.println("Eating....");
        }
    }

    public static class Dog extends Animal{
        public void bark(){
            System.out.println("Barking...");
        }
    }

    public static class Main{
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.eat();
            dog.bark();
        }
    }
}
