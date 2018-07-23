package com.acquisio.basic.java.question01;

import org.junit.Test;

import static org.junit.Assert.*;

public class FooBarTest {

    @Test
    public void testFooBar3() {
        assertEquals("Foo", new FooBar().fooBar(3));
    }

}