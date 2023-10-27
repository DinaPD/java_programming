package chapter5;
/*
Allow the user to input the plan fee and the number of overage minutes. And then you're going
to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.
 */

import java.util.Scanner;

public class PhoneBillCalculator {
    static double overMinutesFee = 0.25;
     static double taxFee = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        double cost = baseCost();
        double minutes = overageMinutes();
        scanner.close();
        double overage = calculateOverageFees(overMinutesFee, minutes);
        double tax = calculateTax(cost, overage, taxFee);
        double total = calculateTotal(cost, overage, tax);
        phoneBillStatement(cost, overage, tax, total);
    }

    public static double baseCost(){

        System.out.println("Enter base cost of the plan:");
        double cost = scanner.nextDouble();
        return cost;
    }

    public static double overageMinutes(){
        System.out.println("Enter overage minutes:");
        double minutes = scanner.nextDouble();
        return minutes;
    }
    public static double calculateOverageFees(double overMinutesFee, double minutes){

        double overage = overMinutesFee * minutes;
        return overage;
    }
    public static double calculateTax(double cost, double overage, double taxFee ){
        double tax = (cost + overage) * taxFee;
        return tax;
    }

    public static double calculateTotal(double cost, double overage, double tax){
       double total = cost + overage + tax;
       return total;
    }

    public static void phoneBillStatement(double cost, double overage, double tax, double total){

        System.out.println("Plan: $" + String.format("%.2f", cost));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
