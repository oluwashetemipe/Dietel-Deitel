package Chap9;

public class HourlyEmployee extends Employee{
    private double hours;
    private double wages;

    public HourlyEmployee(String firstName, String lastName, String ssn, double hours, double wages) {
        super(firstName, lastName, ssn);
        this.hours = hours;
        this.wages = wages;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }
}
