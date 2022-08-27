package Chap4;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String... args){
        int employeeCounter = 1;
        double grossPay;
        Scanner input = new Scanner(System.in);
        while (employeeCounter <= 3){
            System.out.println("Please enter employee's name:");
            String name = input.next();
            System.out.println("Please enter employee's number of hours worked last week:");
            int hoursWorked = input.nextInt();
            System.out.println("Please enter hourly rates:");
            int hourlyRate = input.nextInt();
            if (hoursWorked <= 40){
                grossPay = hoursWorked * hourlyRate;
            }
            else {
                grossPay = 40 * hourlyRate + ((hoursWorked - 40) * (1.5 * hourlyRate));
            }
            System.out.printf("%s's gross pay is %.2f%n",name,grossPay);
            employeeCounter++;
        }
    }
}
