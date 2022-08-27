package Chap4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String... args){
        int miles;
        int gallon;
        int tripCounter = 0;
        double total = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles for trip or -1 to quit");
        miles = input.nextInt();

        while (miles != -1){
            System.out.println("Enter gallons used for trip");
            gallon = input.nextInt();
            double milesPerGallonPerTrip =(double) miles/gallon;
            System.out.printf("%.2f miles/gallon is used for this trip\n",milesPerGallonPerTrip);
            total += milesPerGallonPerTrip;
            tripCounter++;
            System.out.println("Enter miles for trip or -1 to quit");
            miles = input.nextInt();
        }
        System.out.printf("Combined miles/per gallon for %d trip(s) is %.2f%n",tripCounter,total);
    }
}
