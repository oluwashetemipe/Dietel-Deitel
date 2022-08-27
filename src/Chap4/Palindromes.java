package Chap4;

import java.util.Scanner;

public class Palindromes {
    public static void main(String... args){
        System.out.println("Enter any 5 digit number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int firstNumber, secondNumber,fourthNumber, fifthNumber;


        while (number >= 100000 || number < 10000) {
            System.out.println("Enter a valid input");
            number = input.nextInt();
            }

        firstNumber = number / 10000;
        secondNumber = number % 10000 / 1000;
        fourthNumber = number % 100 / 10;
        fifthNumber = number % 10;
        if (firstNumber == fifthNumber && secondNumber == fourthNumber) {
            System.out.println("Number is a palindrome");
        } else
        {
            System.out.println("Number is not a palindrome");
        }
    }
}


