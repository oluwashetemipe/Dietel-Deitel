package Chap10;

import Chap8.DateTime;

public class HourlyEmployee extends  Employee{
    private double hours;
    private double wages;

    public HourlyEmployee(String firstName, String lastName, String ssn, double hours, double wages,DateTime birthdate) {
        super(firstName, lastName, ssn,birthdate);
        this.hours = hours;
        this.wages = wages;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {

        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Hours can only be between 0 and 168");
        }
        this.hours = hours;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        if (wages < 0){
            throw new IllegalArgumentException("Wages cannot be less than 0");
        }
        this.wages = wages;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s%.2f%n%s%.2f%n%s: %.2f","Hourly Employee",super.toString(),"Hours",getHours(),"Wages",getWages(),"Earning",earnings());
    }

    @Override
    public double earnings() {
        if (getHours() <= 40) // no overtime
            return getWages() * getHours();
        else
            return 40 * getWages() + (getHours() - 40) * getWages() * 1.5;
    }
}
