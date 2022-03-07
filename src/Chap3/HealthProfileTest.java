package Chap3;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String... args){
        System.out.println("Please enter your first name: ");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        System.out.println("Please enter your last name: ");
        String lastname = input.nextLine();
        System.out.println("Please enter your gender: ");
        String gender = input.nextLine();
        System.out.println("Please enter your month of birth: ");
        int month = input.nextInt();
        System.out.println("Please enter your day of birth: ");
        int day = input.nextInt();
        System.out.println("Please enter your year of birth: ");
        int year = input.nextInt();
        System.out.println("Please enter your height in inches: ");
        int height = input.nextInt();
        System.out.println("Please enter your weight in pounds: ");
        int weight = input.nextInt();

        HealthProfile healthProfile = new HealthProfile(firstName,lastname,gender,month,day,year,height,weight);
        System.out.printf("Your first name is: %s\n",healthProfile.getFirstName());
        System.out.printf("Your last name is: %s\n",healthProfile.getLastName());
        System.out.printf("You are a: %s\n",healthProfile.getGender());
        System.out.printf("Your date of birth is %s\n",healthProfile.displayDateOfBirth());
        System.out.printf("Your age in years is: %d\n",healthProfile.ageInYears());
        System.out.printf("Your body mass index is: %d\n",healthProfile.bodyMassIndex());
        System.out.printf("Your maximum heart rate is: %d",healthProfile.maximumHeartRate());
        System.out.printf("Your target heart rate is: %d",healthProfile.targetHeartRate());
        System.out.println("BMI VALUES\n" +
                "Underweight:\tless than 18.5\n" +
                "Normal:     \tbetween 18.5 and 24.9\n" +
                "Overweight: \tbetween 25 and 29.9\n"+
                "Obese:      \t30 or greater");
    }
}
