package chapter4;

import java.util.Random;

/*
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls. Roll
 the die for the user (generate a Random number between 1 – 6) and advance the user that number of
 spaces on the game board. After each roll, tell the user which game space they are on and how many
 more spaces they have to go to win. Repeat this 4 additional times, for 5 rolls in total. However,
 if the user gets to 20 before 5 rolls, end the game - they’ve won. If they are greater than or less
  than 20 spaces exactly, they lose.
 */
public class RollTheDieGame {

    public static void main(String args[]) {
        int boardSpaces = 20;
        int space = 0;

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int die= random.nextInt(6) + 1;
            space = space + die;
            int remainingSpaces = boardSpaces - space;
            if (space == boardSpaces) {
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ". You are now on " +
                        "space " + space + ". Congrats! You won!");
                break;
            }else if(i==4 && space<boardSpaces){
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ". You are now on " +
                        "space " + space + ". You went under " + boardSpaces + ". You lose!");

            }else if(space>boardSpaces){
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ". You are now " +
                        "went over " + boardSpaces + ". You lose!");

            }else{

                System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + ". You are now on " +
                        "space " + space + " and have " + remainingSpaces + " more to go.");

            }
        }
    }
}
