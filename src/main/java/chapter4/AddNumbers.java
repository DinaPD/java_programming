package chapter4;
//DO WHILE LOOP
// Write a program that allows a user to calculate the sum of two numbers as many times as they like to.


import java.util.Scanner;

public class AddNumbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean again;
        do {
            System.out.println("Enter the first number");
            double first_number = scanner.nextDouble();

            System.out.println("Enter the second number");
            double second_number = scanner.nextDouble();
            double sum = first_number + second_number;
            System.out.println("The sum is: " + sum);
            System.out.println("Would you like to start over? True or false.");
            again = scanner.nextBoolean();

        } while (again);
        scanner.close();

    }
}
