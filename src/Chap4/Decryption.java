package Chap4;

import java.util.Scanner;

public class Decryption {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter four digit number for decryption:");
        int number = input.nextInt();
        int decryptedFirst, decryptedSecond, decryptedThird, decryptedFourth, firstNumber, secondNumber,thirdNumber, fourthNumber, decryptedWholeNumber;

        if(number > 999 && number < 10000){
            firstNumber = number / 1000;
            secondNumber = number % 1000 / 100;
            thirdNumber = number % 100 / 10;
            fourthNumber = number % 10;

            decryptedFirst = thirdNumber;
            decryptedSecond = fourthNumber;
            decryptedThird = firstNumber;
            decryptedFourth = secondNumber;

            decryptedFirst = (decryptedFirst + 3);
            decryptedSecond = (decryptedSecond + 3);
            decryptedThird = (decryptedThird + 3);
            decryptedFourth = (decryptedFourth + 3);

            decryptedWholeNumber =( decryptedFirst * 1000) + (decryptedSecond * 100) + (decryptedThird * 10) + decryptedFourth;
            System.out.println(decryptedWholeNumber);
        }
    }
}
