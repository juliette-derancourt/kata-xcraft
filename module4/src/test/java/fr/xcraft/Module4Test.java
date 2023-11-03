package fr.xcraft;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Module4Test {
    @Test
    void testToHexa() {
        String expected = "006B";
        assertEquals(expected, Module4.toHexa("k"));
    }
}
