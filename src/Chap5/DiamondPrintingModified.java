package Chap5;

import java.util.Scanner;

public class DiamondPrintingModified {
    public static void main(String[] args) {
        int star = 1;
        System.out.println("Enter an odd number from the range of 1 - 19");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();

        if (rows >= 1 & rows <= 19){
            if (rows % 2 == 1){
                int spaces = (rows - 1) / 2;
                int middle = spaces + 1;
                for (int i = 1; i <= rows; i++){
                    for (int o = 1; o <= spaces; o++){
                        System.out.print(" ");
                    }
                    if (i < middle){
                        for (int j = 1; j <= star; j++){
                            System.out.print("*");
                        }
                        spaces--;
                        star += 2;
                        System.out.println();
                    }
                    if (i == middle){
                        for (int j = 1; j <= rows; j++){
                            System.out.print("*");
                        }
                        spaces += 1;
                        star -= 2;
                        System.out.println();
                    }

                    if (i > middle){
                        for (int j = 1; j <= star; j++){
                            System.out.print("*");
                        }
                        star -= 2;
                        spaces++;
                        System.out.println();
                    }
//                    System.out.println(spaces);
//                    System.out.println(star);


                }

            }
            else
                System.out.println("Number isn't odd");
        }
        else
            System.out.println("Number isn't between 1 and 15");
    }
}
