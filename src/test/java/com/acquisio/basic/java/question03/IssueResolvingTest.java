package com.acquisio.basic.java.question03;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class IssueResolvingTest {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void factorial() throws Exception {
        assertEquals(5040, new IssueResolving().factorial(7));
    }

    @Test
    public void factorialNegativeNumber() throws Exception {
        exceptionRule.expect(ArithmeticException.class);
        exceptionRule.expectMessage("Negative number doesn't have factorial.");
        new IssueResolving().factorial(- 1);
    }

}