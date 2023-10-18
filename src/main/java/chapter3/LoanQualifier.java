package chapter3;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
    public static void main(String args[]){
        int quota_salary = 30000;
        int quota_years = 2;

        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextInt();

        System.out.println("Enter the years you are working at current job");
        double years = scanner.nextInt();
        scanner.close();

        if(salary >= quota_salary){
            if(years >= quota_years){
                System.out.println("Congrats! You qualify for the loan!");
            }else{
                System.out.println("Sorry, you must have worked at your current job " + quota_years + " years");
            }

        }else{
            System.out.println("Sorry, you must have salary at least $" + quota_salary);
        }


    }

}
