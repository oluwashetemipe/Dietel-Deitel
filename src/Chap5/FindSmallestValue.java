package Chap5;

import java.util.Scanner;

public class FindSmallestValue {
    public static void main(String[] args){
        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);
        int firstValue;
        int i = 1;
        int smallestValue = 0;
        int value = 0;
        firstValue = input.nextInt();

        for (i = 2; i <= firstValue; i++) {
            System.out.println("Please enter a number:");
            value = input.nextInt();
            smallestValue = firstValue;
            if(value < smallestValue){
                smallestValue = value;
            }
        }

        System.out.println(smallestValue);
    }

//        for(i = 1; i <= firstValue; i++){
//            System.out.println("Please enter a digit: ");
//            values = input.nextInt();
//            if (values < firstValue){
//                smallestValue = values;
//            }
//            else {
//                smallestValue = firstValue;
//            }
//        }
//        System.out.println(smallestValue);


    }

