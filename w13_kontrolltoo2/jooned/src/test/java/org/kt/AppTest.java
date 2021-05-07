package org.kt;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void checkJoonGetY()
    {
        Joon joon = new Joon(3);
        assertTrue(joon.getY(2)==6);
        assertTrue(joon.getY(4)==12);
        assertTrue(joon.getY(3)==9);
    }@Test
    public void checkJoon2GetY()
    {
        Joon2 joon2 = new Joon2(3, 0);
        assertTrue(joon2.getY(2)==6);
        assertTrue(joon2.getY(4)==12);
        assertTrue(joon2.getY(3)==9);
        Joon2 joon2_2 = new Joon2(3, 2);
        assertTrue(joon2_2.getY(2)==8);
        assertTrue(joon2_2.getY(4)==14);
        assertTrue(joon2_2.getY(3)==11);
    }
    public void checkJoon2ArrayGetY()
    {
        Joon2 joon2_3 = new Joon2(3, 0);
        double[] x = new double[]{1,2,3,4,5};
        assertArrayEquals("Massiivi väärtused ei ühti", joon2_3.getY(2)==6);
        assertTrue(joon2.getY(4)==12);
        assertTrue(joon2.getY(3)==9);
        Joon2 joon2_2 = new Joon2(3, 2);
        assertTrue(joon2_2.getY(2)==8);
        assertTrue(joon2_2.getY(4)==14);
        assertTrue(joon2_2.getY(3)==11);
    }
}
