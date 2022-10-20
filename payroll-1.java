package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main
{
    //makes sure that it doesn't go over 2 sig figs
    private static DecmialFormat df = new DecimalFormat("########0.00");


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enterzzz the Employee's full name: ");
        String name=sc.nextLine();
        System.out.print("Enter the Employee's number: ");
        String number=sc.nextLine();
        System.out.print("Enter the pay rate per hour: ");
        double rate=sc.nextDouble();
        System.out.print("Enter the regular hours worked: ");
        double hours=sc.nextDouble();
        double gross=rate*hours;
        double tax=gross*0.06;
        double net=gross-tax;
        System.out.println("Thank you!");
        System.out.println("Here is your paycheck!");
        System.out.println("------------------------------------------");
        System.out.println("Employee's name:\t"+name);
        System.out.println("Employee's number:\t"+number);
        System.out.println("Hourly rate of pay:\t"+rate);
        System.out.println("Hours worked:\t\t"+hours);
        System.out.printf("\nTotal Gross Pay:\t$%.2f",gross);

        System.out.printf("\nDeductions\nTax (6 %%):\t$%.2f\t",(tax));
        System.out.printf("\nNet Pay:\t\t Dollars$%.2f",net);

        System.out.println("------------------------------------------");
        System.out.println("Bye!");
    }
}
