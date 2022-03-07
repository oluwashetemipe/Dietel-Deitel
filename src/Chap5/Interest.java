package Chap5;

import java.util.Scanner;

public class Interest {
    public static void main(String... args){
        int amount;
        int principal = 1000;
        double rate =  0.05;
        int sum = 0;
        int count;

        //display headers
        System.out.printf("%s%20s%n", "Year","Amount on deposit");

        //calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10 ; year++) {
            //calculate new amount for specified year
            amount = (int)(principal * Math.pow(1 + (rate), year));
            int dollar = amount/100;
            int cents = amount % 100;

            System.out.printf("%4d%20d.%d%n", year, dollar,cents);
        }
//        for (int year = 1; year <= 10 ; year++)
//            for (rate = 6; rate <= 10; rate++){
//                //calculate new amount for specified year
//                amount = (principal * Math.pow(1 + (rate/100), year));
//                System.out.printf("%4d%,20d%n", year, amount);
//
//            }


//        for (count = 1; count<= 99 ; count++){
//            if(count % 2 == 1){
//                sum += count;
//            }
//        }
//        System.out.printf("Sum is: %d%n", sum);
//
//        System.out.println(Math.pow(2.5,3));
//        int i = 1;
//        while (i <= 20){
//            System.out.print(i);
//            System.out.print('\t');
//            if(i % 5 == 0){
//                System.out.println();
//            }
//            i++;
//        }
//        for (i = 1; i <= 20; i++){
//            System.out.print(i);
//            System.out.print('\t');
//            if(i % 5 == 0){
//                System.out.println();
//            }
//        }
//        for (i = 100; i >= 1; i--){
//            System.out.println(i);
//        }
//        System.out.println("Enter a value:");
//        Scanner input = new Scanner(System.in);
//        int value = input.nextInt();
//        switch (value % 2){
//            case 0:
//                System.out.println("Even integer");
//                break;
//            case 1:
//                System.out.println("Odd integer");
//        }
//        for (i = 19; i >= 1; i-=2){
//            System.out.println(i);
//        }
//
//        count = 2;
//        do {
//            System.out.print(count);
//            System.out.print('\t');
//            count += 2;
//        }while (count < 100);
    }
}


