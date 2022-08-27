package Chap5;

public class
ProductOfOddIntegers {
    public static void main(String[] args){
        int i;
        int product = 1;
        for (i = 1; i <= 15; i++){
            if(i % 2 == 1){
                product *= i;
            }
        }
        System.out.printf("%,d",product);
    }
}
