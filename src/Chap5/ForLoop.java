package Chap5;

public class ForLoop {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }
//        for (int i = 1; i <= 5; i++){
//            for (int j = 1; j <= 10; j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
        //initialize count
        //use for loop to increment count
        //for every count print 1 - 10 using for loop

        int count;
//        for (count = 1; count <= 10; count++) {
//            for (int i = 1; i <= 10; i++) {
//                System.out.printf("%d", i);
//                System.out.print(' ');
//            }
//            System.out.printf("- %d", count);
//            System.out.println();
//        }


//        1 2 3 4 5 6 7 8 9 10 - 1
//        2 4 6 8 10 12 14 16 18 20 - 2
//        1 2 3 4 5 6 7 8 9 10 - 2
//        2 4 6 8 10 12 14 16 18 20 - 4
//        1 2 3 4 5 6 7 8 9 10 - 3
//        2 4 6 8 10 12 14 16 18 20 - 6
//        1 2 3 4 5 6 7 8 9 10 - 4
//        2 4 6 8 10 12 14 16 18 20 - 8
//        1 2 3 4 5 6 7 8 9 10 - 5
//        2 4 6 8 10 12 14 16 18 20 - 10
//        1 2 3 4 5 6 7 8 9 10 - 6
//        2 4 6 8 10 12 14 16 18 20 - 12
//        1 2 3 4 5 6 7 8 9 10 - 7
//        2 4 6 8 10 12 14 16 18 20 - 14
//        1 2 3 4 5 6 7 8 9 10 - 8
//        2 4 6 8 10 12 14 16 18 20 - 16
//        1 2 3 4 5 6 7 8 9 10 - 9
//        2 4 6 8 10 12 14 16 18 20 - 18
//        1 2 3 4 5 6 7 8 9 10 - 10
//        2 4 6 8 10 12 14 16 18 20 -

        //initialize first count to keep track of +1 increment
        //initialize second count to keep track of second  increment
        //use for loop to increment first count
        //use for loop to increment second count
        //in first count for loop use a nested for loop to print 1 - 10
        //in second count use for loop to print 2 - 20
        for(count = 1; count <= 10; count++){
            for (int j = 1; j <= 10; j++){
                System.out.printf("%d", j);
                System.out.print(" ");
            }
            System.out.printf("-%d", count);
            System.out.println();
            for (int n = 2; n <= 20; n += 2){
                System.out.printf("%d",n);
                System.out.print(" ");
            }
            System.out.printf("-%d",count*2);
            System.out.println();
        }
    }
}

