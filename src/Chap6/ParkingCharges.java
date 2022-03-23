package Chap6;

import java.util.Scanner;

public class ParkingCharges {
    private static final int MINIMUM_FEE = 2;
    private static final double ADDITIONAL_HOUR = 0.50;
    private static final int MAX_FEE = 10;

    public static void main(String[] args) {
        int hours;
        double receiptTotal = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of hours or -1 to quit:");
        hours = input.nextInt();

        while (hours != -1){
            double currentCharge = calculateCharges(hours);
            System.out.printf("Charge for current fee $%.2f%n", currentCharge);
            receiptTotal += currentCharge;
            hours = input.nextInt();
        }
        System.out.printf("Receipt total for yesterday's car parking charges $%.2f%n" ,receiptTotal);
    }

    public static double calculateCharges(int hours) {
        if (hours <= 2) {
            return MINIMUM_FEE;
        } else if (hours < 24) {
            double fee;
            fee = MINIMUM_FEE + (hours - 2) * ADDITIONAL_HOUR;
            return fee;
        }
        else if (hours == 24){
            return MAX_FEE;
        }
        else
            return 0;
    }
}