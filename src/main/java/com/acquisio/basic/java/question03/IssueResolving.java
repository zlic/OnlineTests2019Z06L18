package com.acquisio.basic.java.question03;

/**
 * QUESTION 04: StackOverflow
 * This program crashes after throwing StackOverflowError exception:
 * Fix the factorial method.
 *
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class IssueResolving {
    public static void main(String[] args) {
        IssueResolving instance = new IssueResolving();
        System.out.println(instance.factorial(7));
    }

    /**
     * Factorial
     * <p>
     * the factorial of a positive integer n, denoted by n! <br>
     * - n &gt; 0, n! = n * ( n - 1 ) * ( n - 2 ) * ... * 3 * 2 * 1 <br>
     * - n = 0, n! = 1 <br>
     * - n &lt; 0, throw ArithmeticException <br>
     * @param n a positive integer
     * @return factorial of n
     */
    int factorial(int n) {
        if (n < 0) {
            throw new ArithmeticException("Negative number doesn't have factorial.");
        }
        int result = 1;
        while (n != 0) {
            result = result * n;
            n--;
        }
        return result;
    }

}
