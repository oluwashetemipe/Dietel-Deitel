package Chap8;

public class SavingsAccount {
    private static int annualInterestRate;
    private double savingsBalance;

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest(){
        savingsBalance += savingsBalance * (annualInterestRate) / 12;
        return savingsBalance;
    }

    public static int getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(int annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public static void modifyInterestRate(int rate){
        annualInterestRate = rate;
    }
}
