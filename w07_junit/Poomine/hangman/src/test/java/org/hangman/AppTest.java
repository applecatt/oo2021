package org.hangman;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    static Game game;
    /**
     * Rigorous Test :-)
     

    @BeforeClass
    public static void init(){
        hangman = new Hangman();
    }
*/
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void checkFillList(){
        String word =  "apple";
        String fromList[] = new String[5];
        fromList = word.split("");
        String toList[] = new String[5];
        String string = "p";
        String[] correct = new String[5];
        correct[1]="p";
        correct[2]="p";



        assertArrayEquals("Arrays must be equal", Hangman.fillList(fromList, toList, string), correct);
    }
    @Test
    public void checkGetSplitLength(){
        Hangman hangman = new Hangman();
        
        assertArrayEquals("Arrays must be equal", hangman.splitLength, hangman.getSplitLength());
    }
}
