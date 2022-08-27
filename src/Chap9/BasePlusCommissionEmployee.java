package Chap9;

public class BasePlusCommissionEmployee {
    private CommissionEmployee commissionEmployee;
    private double baseSalary;



    public BasePlusCommissionEmployee( double commissionRate, double baseSalary){
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

}
//Ex 9.4
