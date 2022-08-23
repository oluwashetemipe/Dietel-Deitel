public class SavingsAccTest {
    public static void main(String[] args) {
        SavingsAccount savingsAccount1 = new SavingsAccount(2000.00);
        SavingsAccount savingsAccount2 = new SavingsAccount(3000.00);
        SavingsAccount.setAnnualInterestRate(4);
        for (int i = 1; i <= 12; i++){
            savingsAccount1.calculateMonthlyInterest();
            savingsAccount2.calculateMonthlyInterest();
            System.out.println(savingsAccount1.getSavingsBalance());
            System.out.println(savingsAccount2.getSavingsBalance());
        }
        SavingsAccount.setAnnualInterestRate(5);
        savingsAccount1.calculateMonthlyInterest();
        savingsAccount2.calculateMonthlyInterest();
        System.out.println(savingsAccount1.getSavingsBalance());
        System.out.println(savingsAccount2.getSavingsBalance());
    }

}
