package Introduction;

import java.util.*;
public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        // Attempt to load a class that doesn't exist
        try {
            Class.forName("java.util.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }

        // Attempt to load a misspelled class
        try {
            Class.forName("java.util.Array");
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }

        // Attempt to load a valid class
        try {
            Class.forName("java.util.ArrayList");
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }
    }
}
