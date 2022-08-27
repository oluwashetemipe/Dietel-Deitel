package Chap5;

import java.util.Scanner;

public class Barchart {
    public static void main(String[] args){
        int firstNumber = 0;;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        int fifthNumber = 0;
        int numberEntered;
        for (int i = 1; i <=5; i++) {
            System.out.println("Please enter a number:");
            Scanner input = new Scanner(System.in);
            numberEntered = input.nextInt();
            if(numberEntered >=1 && numberEntered <= 30){
                if (i == 1){
                    firstNumber = numberEntered;
                }
                else if (i == 2 ){
                    secondNumber = numberEntered;
                }
                else if (i == 3){
                    thirdNumber = numberEntered;
                }
                else if (i == 4){
                    fourthNumber = numberEntered;
                }
                else {
                    fifthNumber = numberEntered;
                }
            }
            //how do I make this loop repeat action if number entered is out of range
        }
        System.out.println();
        for (int i = firstNumber; i>=1; i--){
            System.out.print("*");
        }
        System.out.println();
        for (int i = secondNumber; i>=1; i--){
            System.out.print("*");
        }
        System.out.println();
        for (int i = thirdNumber; i>=1; i--){
            System.out.print("*");
        }
        System.out.println();
        for (int i = fourthNumber; i>=1; i--){
            System.out.print("*");
        }
        System.out.println();
        for (int i = fifthNumber; i>=1; i--){
            System.out.print("*");
        }
        System.out.println();
    }
}
