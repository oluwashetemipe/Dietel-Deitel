package Chap7;

public class SumArray {
    //Summing the elements of an array
    public static void main(String[] args) {
        int[] array = {87,68,94,100,83,78,85,91,76,87};
        int total = 0;

        //add each element's value to total
        for (int counter = 0; counter < array.length; counter++){
            total += array[counter];
        }
        System.out.printf("Total of array elements: %d%n", total);
    }
}
