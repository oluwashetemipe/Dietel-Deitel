package Chap4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String... args){
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;
        int itemNumber;
        int totalSales = 0;
        int salesCounter = 0;
        double earnings;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter item sold or enter -1 to quit: ");
        itemNumber = input.nextInt();

        while (itemNumber != -1){
            if(itemNumber == 1){
                totalSales += item1;
                salesCounter++;
            }
            else if (itemNumber == 2){
                totalSales += item2;
                salesCounter++;
            }
            else if (itemNumber == 3){
                totalSales += item3;
                salesCounter++;
            }
            else if (itemNumber == 4){
                totalSales += item4;
                salesCounter++;
            }
            else {
                System.out.println("Please enter a valid item");
            }
            System.out.println("Please enter item sold or enter -1 to quit: ");
            itemNumber = input.nextInt();
        }
        earnings = 250 + (0.9 * totalSales);
        System.out.printf("Sales earning(s) for %d items sold last week is: %.2f",salesCounter, earnings);

    }
}
