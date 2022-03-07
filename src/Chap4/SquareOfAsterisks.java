package Chap4;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter square size between 1 and 20: ");
        int sideSize = input.nextInt();
        int rowCounter = 0;
        int columnCounter;
            while (rowCounter < sideSize) {
                columnCounter = 0;
                if (sideSize > 1 && sideSize < 20) {
                    while (columnCounter < sideSize) {
                        if (rowCounter == 0 || rowCounter == sideSize - 1 || columnCounter == 0 || columnCounter == sideSize - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        columnCounter++;
                    }
                    System.out.println();
                    rowCounter++;
                }
                else{
                    System.out.println("Invalid square size!Please enter a valid input");
                    sideSize = input.nextInt();
            }
        }

    }
}
