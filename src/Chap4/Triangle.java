package Chap4;

import java.util.Scanner;

public class Triangle {
    public static void main(String... args){
//        int x, y;
//        x = 2;
//        y = 1;
//        int sum = x + y;
        //          int value = 0,value1 = 0,value2 = 0;
//
//        System.out.println(++(sum));

        Scanner input = new Scanner(System.in);
        int value, value1, value2;
        System.out.println("Enter your first value");
        value = input.nextInt();
        System.out.println("Enter your second value");
        value1 = input.nextInt();
        System.out.println("Enter your third value");
        value2 = input.nextInt();

        if (value != 0 && value1 != 0 && value2 != 0){
            if (value == value1  && value == value2){
                System.out.println("Values can represent sides of an equilateral triangle");
            }
            else if (value == value1 || value == value2){
                System.out.println("Values can represent the sides of an isosceles triangle");
            }
            else if (value1 != value2){
                System.out.println("Values can represent a scalene triangle");
            }

//        int sides = 0;
//        while (sides < 3){
//            int value,value1 = 0,value2 = 0;
//            System.out.println("Enter a non-zero value");
//            value = input.nextInt();
//            if (value > 0){
//                System.out.println("Enter second non zero value:");
//                value1 = input.nextInt();
//                sides++;
//                if (value1 > 0){
//                    System.out.println("Enter third non zero value:");
//                    value2 = input.nextInt();
//                    sides++;
//                    if (value2 > 0){
//                        sides++;
//                    }
//                }
//            }
//        else {
//                System.out.println("Invalid value!Enter 3 non zero values");
//        }

        }
        else {
            System.out.println("Invalid values entered");
        }
    }
}
