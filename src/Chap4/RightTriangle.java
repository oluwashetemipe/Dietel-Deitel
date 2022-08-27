package Chap4;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int value, value1, value2;
        int largest;
        System.out.println("Enter a value:");
        value = input.nextInt();
        System.out.println("Enter a value:");
        value1 = input.nextInt();
        System.out.println("Enter a value:");
        value2 = input.nextInt();
        ;

        if (value != 0 && value1 != 0 && value2 != 0){
            if (value > value1 && value > value2) {
                largest = value * value;
                if (largest == value1 * value1 + value2 * value2) {
                    System.out.println("Can represent a right angle triangle");
                } else {
                    System.out.println("Cannot represent a right angle triangle");
                }
            } else if (value1 > value && value1 > value2) {
                largest = value1 * value1;
                if (largest == value * value + value2 * value2) {
                    System.out.println("Can represent a right angle triangle");
                } else {
                    System.out.println("Cannot represent a right angle triangle");
                }
            } else if (value2 > value && value2 > value1) {
                largest = value2 * value2;
                if (largest == value1 * value1 + value * value) {
                    System.out.println("Can represent a right angle triangle");
                } else {
                    System.out.println("Cannot represent a right angle triangle");
                }

            }
//            else
//            {
//                System.out.println("Cannot represent a right angle triangle");
//            }
        }
    }
}
