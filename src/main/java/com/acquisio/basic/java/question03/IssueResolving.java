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
     * the factorial of a positive integer n, denoted by n!
     * @param n a positive integer
     * @return factorial of n
     */
    int factorial(int n) {
        int result = 1;
        while (n!=0){
            result = result * n;
            n--;
        }
        return result;
    }

}
