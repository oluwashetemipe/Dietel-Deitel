package Chap5;

public class ModifiedTrianglePrinting {
    public static void main(String[] args) {
        int spaces = 10;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("     ");
            for (int j = 10; j >= i; j--){
                System.out.print("*");
            }
            System.out.print("     ");

            for (int j = 10; j >= i; j--){
                System.out.print("*");
            }
            System.out.print("     ");
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("     ");
            System.out.println();
        }
    }
}


