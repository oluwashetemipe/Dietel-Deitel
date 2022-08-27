package Chap5;

public class Factorials {
    public static void main(String[] args){
        int i;
        long factorial = 1;
        for (i = 1; i <= 20; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
