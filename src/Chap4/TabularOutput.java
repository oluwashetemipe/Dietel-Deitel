package Chap4;

public class TabularOutput {
    public static void main(String... args){
        System.out.println("N\t\t10*N\t100*N\t1000*N");
        System.out.println();
        int counter = 1;
        while (counter <= 5){
            System.out.printf("%d\t\t%d\t\t%d\t\t%d%n",counter,counter*10,counter*100,counter*1000);
            counter++;
        }
    }
}