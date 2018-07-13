package com.acquisio.basic.java.question05;

import static org.junit.Assert.*;

import org.junit.Test;

public class RefactoringTest {

    @Test
    public void foo() {
        Item[] items = new Item[]{new Item("foo", 0, 0)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

}