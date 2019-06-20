package com.acquisio.basic.java.question06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * QUESTION 07: Debugging
 * This method remove all even number from a list.
 * But the method is not working properly.
 * Find the error and fix it.
 *
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class Debugging {

    public static void main(String[] args) {
        Debugging instance = new Debugging();
        System.out.println(Arrays.toString(instance.removeEvenNumbers(1, 2, 3, 4)));
    }

    Integer[] removeEvenNumbers(Integer ... values) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(values));
        Iterator<Integer> iterator = integers.iterator();
        while(iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 2 == 0) { // remove even numbers
                iterator.remove();
            }
        }

        return integers.toArray(new Integer[integers.size()]);
    }
}
