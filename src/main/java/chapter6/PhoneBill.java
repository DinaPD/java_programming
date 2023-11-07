package chapter6;

import java.util.Scanner;

/*
A phone bill should have an ID, a base cost, a number of allotted minutes and a number of minutes
used. And then, it should also be able to calculate the overage, calculate the tax, and calculate
the total. And then, it should also be able to print an itemized bill. You should also include
three constructors:

- a default one
- one that accepts the ID only
- one that accepts all fields
Now no matter which of these constructors you use, all fields should be set eventually.
Then you can also create a different class that instantiates the PhoneBill and prints out an itemized bill.
 */
public class PhoneBill {

    private double id;
    private double baseCost;
    private double allottedMinutes;
    private double usedMinutes;

    public PhoneBill(){
        id = 0;
        baseCost = 65.5;
        allottedMinutes = 400;
        usedMinutes = 500;
    }

    public PhoneBill(double id){
        this.id = id;
    }

    public PhoneBill(double id, double baseCost, double allottedMinutes, double usedMinutes){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes = usedMinutes;
    }

    public double getId(){
        return id;
    }
    public void setId(double id){
        this.id = id;
    }
    public double getBaseCost(){
        return baseCost;
    }
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public double getAllottedMinutes(){
        return allottedMinutes;
    }
    public void setAllottedMinutes(double allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public double getUsedMinutes(){
        return usedMinutes;
    }
    public void setUsedMinutes(double usedMinutes){
        this.usedMinutes = usedMinutes;
    }

    public double calculateOverage(){
        if(usedMinutes <= allottedMinutes){
            return 0;
        }

        double overageRate = 0.25;
        double overageMinutes = usedMinutes - allottedMinutes;
        return overageMinutes * overageRate;
    }

    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }
}






