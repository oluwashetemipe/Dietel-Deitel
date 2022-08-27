package Chap3;

import java.util.Scanner;

public class HeartRateTest {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String firstName  = input.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Please enter your day of birth: ");
        int day = input.nextInt();
        System.out.println("Please enter your month of birth: ");
        int month = input.nextInt();
        System.out.println("Please enter your year of birth: ");
        int year = input.nextInt();

        HeartRates heartRates = new HeartRates(firstName,lastName,month,day,year);

        System.out.println(heartRates.getFirstName());
        System.out.println(heartRates.getLastName());
        heartRates.displayDateOfBirth();
        System.out.println(heartRates.ageInYears());
        System.out.println(heartRates.maximumHeartRate());
        System.out.println(heartRates.targetHeartRate());

    }
}
