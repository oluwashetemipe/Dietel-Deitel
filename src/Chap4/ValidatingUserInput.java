package Chap4;

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10){
            System.out.println("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();
            if (result == 1){
                passes += 1;
                studentCounter++;
            }
            else if (result == 2){
                failures += 1;
                studentCounter++;
            }
            else
                System.out.println("Enter valid result");
        }
        System.out.printf("Passed %d%nFailed: %d%n",passes,failures);

        if (passes > 8){
            System.out.println("Bonus to instructor");
        }
    }
}
