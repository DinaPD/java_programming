package chapter3;

import java.util.Scanner;

/*
Сreate a program that asks the user to enter the quantities for the following coins.

You'll ask them how many pennies would you like?
How many nickels would you like?
How many dimes?
And then, how many quarters?
What your program is going to do is count up the value of all of the change that they answered.

If it's exactly one dollar then they win the game.
If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
If it's less than one dollar, tell them how much they went under.
 */
public class CoinsGame {
    public static void main(String args[]){
        int quota = 100;

        System.out.println("Enter the amount of pennies");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("Enter the amount of nickels");
        int nickels = scanner.nextInt();

        System.out.println("Enter the amount of dimes");
        int dimes = scanner.nextInt();

        System.out.println("Enter the amount of quarters");
        int quarters = scanner.nextInt();

        int count = pennies + nickels*5 + dimes*10 + quarters*25;
        int difference_over = count - quota;
        int difference_under = quota - count;

        if(count == quota){
            System.out.println("Congrats! You won the game!");
        }else if(count > quota){
            System.out.println("Sorry, it's more than one dollar. " + difference_over + " coins you went over");
        }else{
            System.out.println("Sorry, " + difference_under + " coins you went under");
        }

    }
}
