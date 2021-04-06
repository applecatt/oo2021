package org.hangman;

public class Gallows {
    public String nextGallow(int wrongGuess){
        String image = "";
        switch(wrongGuess) {
            case 0:
              break;
            case 1:
              image+="\n";
              image+="\n";
              image+="|";
              return image;
            case 2:
            image+="\n";
            image+="|";
            image+="|";
            default:
              // code block
          }
    }
}
