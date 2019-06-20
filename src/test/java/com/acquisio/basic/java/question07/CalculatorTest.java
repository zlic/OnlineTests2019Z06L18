package com.acquisio.basic.java.question07;

import com.acquisio.basic.java.question03.IssueResolving;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testAdd() throws Exception {
        int result = Calculator.applyOperation(2, 2, '+');
        assertEquals(4, result);
    }

    @Test
    public void testMinus() throws Exception {
        int result = Calculator.applyOperation(2, 2, '-');
        assertEquals(0, result);
    }

    @Test
    public void testMultiply() throws Exception {
        int result = Calculator.applyOperation(2, 3, '*');
        assertEquals(6, result);
    }

    @Test
    public void testDivide() throws Exception {
        int result = Calculator.applyOperation(6, 3, '/');
        assertEquals(2, result);
    }

    @Test
    public void testDivideZero() throws Exception {
        assertNull(Calculator.applyOperation(6, 0, '/'));
    }

    @Test
    public void testNotSupport() throws Exception {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Operator 'a' not supported");
        Calculator.applyOperation(2, 2, 'a');
    }

}
