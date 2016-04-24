package com.example.template;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExampleBTest {
    private Example example = new Example();

    @Test
    public void countString() {
        assertEquals(5, example.countString("Hello"));
        assertEquals(6, example.countString("漢字の文字数"));
    }
}
// vim: set ts=4 sw=4 et:
