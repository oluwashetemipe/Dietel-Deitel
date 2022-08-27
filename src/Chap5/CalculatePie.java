package Chap5;

public class CalculatePie {
    public static void main(String[] args){
        double pie = 0;
        int count;
        double numerator = 4;
        int denominator = 1;

        for (count = 1; count<= 200000 ;count++){
            if (count % 2 == 1){
                pie +=  (numerator / denominator);
                System.out.printf("%d%20.5f%n", count,pie);
                denominator += 2;
            }
            if (count % 2 == 0){
                pie -= (numerator / denominator);
                System.out.printf("%d%20.5f%n",count, pie);
                denominator += 2;
            }

        }
    }
}
