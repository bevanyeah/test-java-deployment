package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Unit test for simple App.
 */
public class UnitTest
{
    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.calculator(1,1), app2.calculator(1,1));
    }

    @Test
    public void testAppOne()
    {
        App app = new App();
        assertEquals(26, app.calculator(-1,27));
    }

    @Test
    public void testAppTwo()
    {
        App app = new App();
        assertEquals(0, app.calculator(-99,99));
    }

    @Test
    public void testAppThree()
    {
        App app = new App();
        assertNotEquals(14, app.calculator(1,1));
    }

    @Test
    public void testAppFour()
    {
        App app = new App();
        assertNotEquals(0, app.calculator(-20,-20));
    }
}

