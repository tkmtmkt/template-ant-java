package com.example.template;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExampleTest {
    private Example example = new Example();

    @Test
    public void countString() {
        assert (5 == example.countString("Hello"));
        assert (6 == example.countString("漢字の文字数"));
    }
}
// vim: set ts=4 sw=4 et:
