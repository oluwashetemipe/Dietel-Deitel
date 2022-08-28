package Chap9;

public class BasePlusCommissionEmployee {
    private final CommissionEmployee commissionEmployee;
    private double baseSalary;



    public BasePlusCommissionEmployee( CommissionEmployee commissionEmployee,double commissionRate, double baseSalary){
        this.commissionEmployee = commissionEmployee;
        if (baseSalary < 0.0)
             throw new IllegalArgumentException(
                 "Base salary must be >= 0.0");

         this.baseSalary = baseSalary;
    }


        public void setBaseSalary(double baseSalary) {
         if (baseSalary < 0.0) {
             throw new IllegalArgumentException(
                     "Base salary must be >= 0.0");
         }

         this.baseSalary = baseSalary;
         }

         public double getBaseSalary(){
            return baseSalary;
         }
         public double earnings() {
            return getBaseSalary() * commissionEmployee.earnings() ;
        }
        @Override
        public String toString()
        {
         return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "Base Commission employee",commissionEmployee.getFirstName() ,commissionEmployee.getLastName() , "social security number",commissionEmployee.getSsn() , "gross sales",commissionEmployee.getGrossSales() , "commission rate",commissionEmployee.getCommissionRate(), "Earning", earnings() );
         }

}
//Ex 9.4
