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
    public double earning(){
        return getHours() * getWages();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %.2f","Hourly Employee",super.toString(),"Earning",earning());
    }
}
