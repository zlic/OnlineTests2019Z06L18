package com.acquisio.basic.java.question01;

/**
 * QUESTION 01: FooBar
 * You have a program that loop from 1 to 50.
 * <p>
 * The program must follow those rules:
 * - Must print 'Foo' if the value can be divided by 3.
 * - Must print 'Bar' if the value can be divided by 5.
 * - Otherwise, print the current integer value in the loop.
 *
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class FooBar {
    public static void main(String[] args) {
        FooBar main = new FooBar();
        for (int i = 1; i <= 50; i ++) {
            System.out.println(main.fooBar(i));
        }
    }

    /**
     * Verify value return different result
     * <p>
     * Return "Foo", if value can be divided by 3<br>
     * Return "Bar", if value can be divided by 5<br>
     * otherwise, return the value as string
     * @author Zhen Li
     * @param value an integer value
     * @return a string value
     */
    String fooBar(int value) {
        String r = String.valueOf(value);
        if( value % 15 == 0 ){
            r = "FooBar";
        }else if ( value % 3 == 0){
            r = "Foo";
        }else if ( value % 5 == 0){
            r = "Bar";
        }
        return r;
    }
}
