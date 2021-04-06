package org.hangman;

import java.util.Scanner;
import java.util.Random;


/**
 * Hello world!
 *
 */
public class Hangman
{
    public static int wrongGuess=0;
    private static String[] words = {"apple", "banana", "programming", "thunderstorm", "Terminator", "Slicer","Ninja", "cow", "Robot", "littlegirl"};
    public String randomWord;
    public static void main(String[] args) {
    
        System.out.println("Mängid poomismängu!");

        randomWord = getRandomWord();

        System.out.println("")    
    }
    

    

    public static String getRandomWord(){
        Random r = new Random();
        String word = words[r.nextInt(words.length-1)];
        return word;
    }

    
}
