package Chap4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String... args){
        int counter = 1;
        int number;
        int largest = 0;

        Scanner input = new Scanner(System.in);

        while (counter <= 10){
            System.out.println("Please enter a number:");
            number = input.nextInt();
            if (largest < number){
                largest = number;
            }
            counter++;
        }
        System.out.printf("Largest number is: %d",largest);
    }
}
