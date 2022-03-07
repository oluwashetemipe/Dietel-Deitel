package Chap4;

public class CheckerboardPattern {
    public static void main(String... args){
        int row = 0;
        int column;

        while (row < 8){
            column = 0;
            while (column < 16){
                if (column % 2 == 0 && row % 2 == 0){
                    System.out.print("* ");
                    System.out.print(" ");
                }
                else if (column % 2 == 1 && row % 2 == 1){
                    System.out.print(" ");
                    System.out.print("* ");
                }

                column++;
            }
            System.out.println();
            row++;
        }
    }
}
