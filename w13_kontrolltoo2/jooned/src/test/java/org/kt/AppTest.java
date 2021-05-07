package org.kt;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import java.util.Arrays;

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
    @Test
    public void checkJoon2ArrayGetY()
    {
        Joon2 joon2_3 = new Joon2(3, 2);
        int[] x = new int[]{1,2,3,4,5};
        assertArrayEquals(Arrays.asList(5,8,11,14,17).toArray(), Arrays.asList(joon2_3.getY(x));
    }
    @Test
    public void checkJoonFile(){
        try (Scanner scanner = new Scanner(new File("joon.txt"));
            
            while (scanner.hasNextLine()){
                line = scanner.nextLine();

            
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }


}
