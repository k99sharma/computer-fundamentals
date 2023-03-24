package Encapsulation;

/**
 * We can bypass encapsulation using Reflection or by directly accessing the fields and methods of a class through its
 * bytecode. However, it is discouraged as it can lead to security and stability issues.
 */

import java.lang.reflect.Field;
public class BypassEncapsulation {
    private int myPrivateField;

    public BypassEncapsulation(int value){
        myPrivateField = value;
    }

    public static void main(String[] args) throws Exception {
        BypassEncapsulation obj = new BypassEncapsulation(42);

        // getting private field of BypassEncapsulation class
        Field field = BypassEncapsulation.class.getDeclaredField("myPrivateField");

        // setting private field accessible
        field.setAccessible(true);

        // getting the value of private attribute
        int value = (int) field.get(obj);

        System.out.println(value);
    }
}
