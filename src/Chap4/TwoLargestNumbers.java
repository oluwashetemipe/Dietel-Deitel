package Chap4;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String... args){
        int number;
        int counter = 1;
        int largest = 0;
        int secondLargest = 0;

        Scanner input  = new Scanner(System.in);

        while (counter <= 10){
            System.out.println("Please enter a number:");
            number = input.nextInt();
            if (number > largest){
                secondLargest = largest;//store largest into second largest
                largest = number;//store largest to inputted largest/number
            }
            /*else if (number > secondLargest) {
                secondLargest = number;
            }*/
            counter++;
        }
        System.out.printf("%d Largest and %d Second Largest",largest,secondLargest);

    }
}
