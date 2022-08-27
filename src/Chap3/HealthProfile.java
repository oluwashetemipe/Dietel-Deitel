package Chap3;

import java.io.PrintStream;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int month;
    private int day;
    private int year;
    private int height;
    private int weight;

    public HealthProfile(String firstName, String lastName, String gender, int month, int day, int year, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }
    public int ageInYears(){
        return (2022 - year);
    }
    public int maximumHeartRate(){
        return (220 - ageInYears());
    }
    public int targetHeartRate(){
        return (int) (((0.85) * maximumHeartRate()) -((0.50) * maximumHeartRate()));
    }
    public int bodyMassIndex(){
        return (weight * 703)/(height * height);
    }
    public PrintStream displayDateOfBirth(){
        return System.out.printf("%d/%d/%d\n" ,month,day,year);
    }
}
