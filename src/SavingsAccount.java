public class SavingsAccount {
    private static int annualInterestRate;
    private int savingsBalance;

    public int getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(int savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    //


    public int calculateMonthlyInterest(){
        savingsBalance += savingsBalance * (annualInterestRate) / 12;
        return savingsBalance;
    }
    public static void modifyInterestRate(int rate){
        annualInterestRate = rate;
    }
}
