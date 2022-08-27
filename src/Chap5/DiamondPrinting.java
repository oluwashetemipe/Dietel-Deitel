package Chap5;

public class DiamondPrinting {
    public static void main(String[] args) {
        int star = 1;
        int space = 4;
        for (int i = 1; i <= 9; i++){
            for (int o = 1; o <= space; o++){
                System.out.print(" ");
            }
            if (i < 5){
                for (int j = 1; j <= star; j++ ){
                    System.out.print("*");
                }
                space --;
                star += 2;
            }
            if (i == 5){
                for (int j = 1; j <= 9; j++){
                    System.out.print("*");
                }
                space += 1;
                star -= 2;
            }
            if (i > 5){
                for (int j = 1; j <= star; j++ ){
                    System.out.print('*');
                }
                star -= 2;
                space++;
            }
            System.out.println();
        }
    }
}
//print diamond app
