package Chap6;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        double number;
        int numberInt;
        System.out.println("Enter a double floating point digit or -1 to quit:");
        Scanner input = new Scanner(System.in);
        number = input.nextDouble();

        while (number != -1){
            System.out.printf("Original number %.3f, Rounded to nearest int %d%nRounded to the nearest tenth %.2f%nRounded to the nearest hundredth %.3f%nRounded to the nearest thousandth %.4f%n",
                    number,roundToInteger(number),
                    roundToTenths(number),roundToHundredths(number),
                    roundToThousands(number));
            System.out.println("Enter a double floating point digit or -1 to quit:");
            number = input.nextDouble();
        }
    }
    //rounding to specific decimal places
    public static int roundToInteger(double number){
        return  (int) Math.floor(number + 0.5);
    }
    public static double roundToTenths(double number){
        return Math.floor(number * 10 + 0.5)/10;
    }
    public static double roundToHundredths(double number){
        return Math.floor(number * 100 + 0.5)/100;
    }
    public static double roundToThousands(double number){
        return Math.floor(number * 1000 + 0.5)/1000;
    }

}
