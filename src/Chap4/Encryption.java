package Chap4;

import java.util.Scanner;

public class Encryption {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit integer:");
        int number = input.nextInt();
        int lastDigit, thirdDigit, secondDigit, firstDigit, encryptedFirstDigit, encryptedLastDigit,encryptedSecondDigit, encryptedThirdDigit,encryptedWholeNumber;

        if (number >= 1000 && number < 10000){
            lastDigit = number %  10;
            thirdDigit = number % 100/ 10;
            secondDigit = number % 1000 / 100;
            firstDigit = number / 1000;

            lastDigit = (lastDigit + 7) % 10;
            thirdDigit = (thirdDigit + 7) % 10;
            secondDigit = (secondDigit + 7) % 10;
            firstDigit = (firstDigit + 7) % 10;

            encryptedFirstDigit = thirdDigit;
            encryptedSecondDigit = lastDigit;
            encryptedThirdDigit = firstDigit;
            encryptedLastDigit = secondDigit;

            encryptedWholeNumber = (encryptedFirstDigit * 1000) + (encryptedSecondDigit * 100) + (encryptedThirdDigit * 10) + encryptedLastDigit;
            System.out.println(encryptedWholeNumber);
        }
        else {
            System.out.println("Invalid number!");
        }
    }
}
