package com.acquisio.onlinetest.question04;

/**
 * QUESTION 04: StackOverflow
 * This program crashes after throwing StackOverflowError exception:
 * Fix the factorial method.
 *
 * IMPORTANT: Add all missing javadoc that you think is necessary.
 */
public class IssueResolving {
    public static void main(String[] args) {
        IssueResolving instance = new IssueResolving();
        System.out.println(instance.factorial(7));
    }

    private int factorial(int n) {
        // TODO: Fix code here.
        int result = 0;
        result = factorial(n - 1) * n;
        return result;
    }

}
