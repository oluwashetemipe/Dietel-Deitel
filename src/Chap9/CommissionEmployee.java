package Chap9;

public class CommissionEmployee extends Employee{
//    private final String firstName;
//    private final String lastName;
//    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate) {
        super(firstName,lastName,ssn);
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String getSocialSecurityNumber() {
//        return socialSecurityNumber;
//    }




    public double earnings(){
         return getCommissionRate() * getGrossSales();
    }
    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%.2f","Commission Employee",super.toString(),earnings());
    }
}
