package Chap3;

public class Account {
    private String name;//instance variable- attributes
    private double balance;//instance variable

    //constructor initializes name with parameter name
    public Account(String name, double initialBalance)//constructor name is class name
    {
        this.name = name;

       //validate that the balance is greater than 0.0 if it's not
       //instance variable balance keeps default value of 0.0
        if (initialBalance > 0.0)//if balance is valid
            this.balance = initialBalance ;//assign it to instance variable balance
    }
    //method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount){
        if(depositAmount > 0.0)//if deposit amount is valid
            balance = balance + depositAmount;
    }
    //method that returns account balance
    public double getBalance(){
        return balance;
    }

    public void withdraw(double withdrawalAmount){
        if(balance < withdrawalAmount) {
            System.out.println("Withdrawal amount exceeded account balance.");
        }

        if(balance > withdrawalAmount) {
            balance = balance - withdrawalAmount;
            System.out.println("Withdrawal successful, new balance " + balance);
        }
    }
    //method to set the name in the object
    public void setName(String name){
        this.name = name;//store the name
    }
    //method to retrieve the name from the object
    public String getName(){
        return name;//return value of name to the caller
    }
}
