package Chap6;

import java.util.Scanner;

public class CalculateVolume {
    public static void main(String[] args) {
     double radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        radius = input.nextDouble();
        System.out.printf("%f%n",sphereVolume(radius));
    }
    public static double sphereVolume(double radius){
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
}
