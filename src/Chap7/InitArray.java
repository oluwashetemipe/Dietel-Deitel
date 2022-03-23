package Chap7;


public class InitArray {
    public static void main(String[] args) {
        //int[] array = new int[10];// array creation and initialization

        //array initializer
        //int[] array = {32,27,64,18,95,14,90,70,60,37};

        //creating and calculating the values to store in an array
        final int ARRAY_LENGTH = 10;//declare constant
        int[] array = new int[ARRAY_LENGTH];//create array

        //calculate value for each array element
        for (int counter = 0; counter < array.length; counter++){
            array[counter] = 2 + 2 * counter;
        }
        System.out.printf("%s%8s%n", "Index", "Value");//column headings

        for (int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n",counter,array[counter]);
        }
    }
}
