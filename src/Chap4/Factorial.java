package Chap4;

import java.util.Scanner;

public class Factorial {
    public static void main(String... args){
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int factorial = 1;
        int count = 1;
        if (number >= 1){
            while (number >= count){
            factorial *= number * (number - count);
            count++;
            }
            System.out.println(factorial);
        }



//        while (number >= count){
//
//            System.out.println(factorial);
//            count++;
//        }
    }
}
