package Chap8;

import Chap8.TicTac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTest {
    public static void main(String[] args) {
        TicTac ticTac = new TicTac();
//        ticTac.displayGame();
//        ticTac.play(1,2);
//        ticTac.displayGame();
        int count = 1;
       do{
            System.out.println("Please enter your playing position");
            Scanner in = new Scanner(System.in);
           try {
               int position = in.nextInt();
               System.out.println("Please enter your playing number");
               int player = in.nextInt();
               if (position > 1 && position <=9 && player == 1 || player == 2){
                   ticTac.play(position,player);
                   count++;
               }
               else {
                   System.out.println("Please enter new input:");
                   in.nextLine();
               }
           }
           catch (InputMismatchException e){
               System.out.println("Please enter new input");
               in.nextLine();
           }

        }while (count != 9);
       ticTac.displayGame();
    }
}
