package Chap5;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args){
            double productOne = 2.98;
            double productTwo = 4.50;
            double productThree = 9.98;
            double productFour = 4.49;
            double productFive = 6.87;
            int productOneCount = 0;
            int productTwoCount = 0;
            int productThreeCount = 0;
            int productFourCount = 0;
            int productFiveCount = 0;
            int productNumber;
            int quantitySold;
            double totalRetailSold = 0;

            Scanner input = new Scanner(System.in);
            System.out.printf("Please enter Product number:%n%s%n%s%n%s%n",
                    "Type the end-of-file indicator to terminate input:",
                    "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                    "On Windows type <Ctrl> z then press Enter");

            while(input.hasNext()){
                productNumber = input.nextInt();
                if (productNumber >= 1 && productNumber <=5){
                    System.out.println("Please input quantity sold: ");
                    quantitySold = input.nextInt();
                    switch (productNumber) {
                        case 1: {
                            productOneCount += quantitySold;
                            totalRetailSold += productOne * quantitySold;
                            System.out.println("Please enter Product number:");
                            break;
                        }

                        case 2: {
                            productTwoCount += quantitySold;
                            totalRetailSold += productTwo * quantitySold;
                            System.out.println("Please enter Product number:");
                            break;
                        }
                        case 3: {
                            productThreeCount += quantitySold;
                            totalRetailSold += productThree * quantitySold;
                            System.out.println("Please enter Product number:");
                            break;
                        }
                        case 4: {
                            productFourCount += quantitySold;
                            totalRetailSold += productFour * quantitySold;
                            System.out.println("Please enter Product number:");
                            break;
                        }
                        case 5: {
                            productFiveCount += quantitySold;
                            totalRetailSold += productFive * quantitySold;
                            System.out.println("Please enter Product number:");
                            break;
                        }
                    }
                }
                else
                    System.out.println("Please enter a valid product number.");
            }
            System.out.printf("%nTotal value of retail products sold is: %.2f$", totalRetailSold);
    }
}
