package Introduction;

/**
 * Hello world program execution in detail
 *
 * The code defines a class called "HelloWorld". This class contains a single method called 'main', which is the entry point for the program.
 * This method is defined as 'public static void main(String[] args)'.
 * When you compile the "HelloWorld.java" file using the 'javac' command, the java compiler reads the source code and generates byte code.
 * The byte code is stored in a file named 'HelloWorld.class'.
 * When you run the 'HelloWorld' program using 'java' command, the JVM loads the 'HelloWorld.class' into memory.
 * The JVM looks for a 'public static void main(String[] args)' method in the 'HelloWorld' class and finds it.
 * This method is the entry point for the program.
 * The 'main' method calls the 'println' method or the 'System' class to print the string "Hello, World!" to the console.
 * The JVM executes the 'println' method and prints the string "Hello, World!" to the console.
 * The program terminates, and the console becomes available for further input or output.
 */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
