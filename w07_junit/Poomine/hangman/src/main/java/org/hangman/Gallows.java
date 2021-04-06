package org.hangman;

public class Gallows {
    public String gallows(int wrongGuess){
        String image = "";
        switch(wrongGuess) {
            case 0:
                image+="\n";
                image+="\n";
                image+="\n";
                image+="\n";
                image+="\n";
                image+="_/¯¯¯------/¯¯¯¯¯¯¯¯¯¯¯¯¯\-----\_____";
                return image;
            case 1:
                image+="\n";
                image+="\n";
                image+="\n";
                image+="|\n";
                image+="|\n";
                image+="_/¯¯¯------/¯¯¯¯¯¯¯¯¯¯¯¯¯\-----\_____";
                return image;
            case 2:
                image+="\n";
                image+="|\n";
                image+="|\n";
                image+="|\n";
                image+="|\n";
                return image;
            case 3:
                image+="_\n";
                image+="|\n";
                image+="|\n";
                image+="|\n";
                image+="|\n";
                return image;
            case 4:
                image+="__\n";
                image+="|\n";
                image+="|\n";
                image+="|\n";
                image+="|\n";
                return image;
            case 5:
                image+="___\n";
                image+="|\n";
                image+="|\n";
                image+="|\n";
                image+="|\n";
                return image;
            case 6:
                image+="_____\n";
                image+="|\n";
                image+="|\n";
                image+="|\n";
                image+="|\n";
                return image;
            case 7:
                image+="_______\n";
                image+="|      |\n";
                image+="|\n";
                image+="|\n";
                image+="|\n";
                return image;
            case 8: 
                image+="_______\n";
                image+="|      |\n";
                image+="|      Q\n";
                image+="|    --T--\n";
                image+="|     | |\n";
                return image;
            default:
                return "ERROR";
          }
    }
}
