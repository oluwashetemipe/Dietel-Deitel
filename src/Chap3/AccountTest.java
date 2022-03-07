package Chap3;

import java.util.Scanner;

public class AccountTest {
    public static void main(String... args){
//        //create a Scanner object to obtain input
//        Scanner input = new Scanner(System.in);
//        //create an account object and assign it to  myAccount
//        Account myAccount = new Account();
//        System.out.println("Initial name is: " + myAccount.getName());
//        //prompt for and read a name
//        System.out.println("Please enter a name:");
//        String theName = input.nextLine(); //read a line of text
//        myAccount.setName(theName); //put the name in account object myAccount
//        System.out.println();
//
//        //display the name stored in object myAccount
//        System.out.printf("Name in object myAccount is:%n%s%n " ,myAccount.getName());

        //Using constructor to initialize the name instance variable when an Account object is created
        Account account1 = new Account("John Green",50.00);
        Account account2 = new Account("Jane Blue",-7.53);

        //display name and initial balance for each Account
        displayAccount(account1);
        displayAccount(account2);

        //create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.println("Enter deposit amount for account1: ");//prompt
        double depositAmount = input.nextDouble();//obtain user input
        System.out.printf("%nadding %.2f to account balance%n%n" ,depositAmount);
        account1.deposit(depositAmount);

        //display balances
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: ");//prompt
        depositAmount = input.nextDouble();//obtain user input
        System.out.printf("%nadding %.2f to account balance%n%n" , depositAmount);
        account2.deposit(depositAmount);

        //display balance
        displayAccount(account1);
        displayAccount(account2);

        System.out.println("Enter amount to withdraw from account1: ");
        double withdrawalAmount = input.nextDouble();
        System.out.printf("%nwithdrawing %.2f from account1%n" , withdrawalAmount);
        account1.withdraw(withdrawalAmount);

        System.out.println("Enter amount to withdraw from account2: ");
        withdrawalAmount = input.nextDouble();
        System.out.printf("%nwithdrawing %.2f from account2:%n", withdrawalAmount);
        account2.withdraw(withdrawalAmount);

        displayAccount(account1);
        displayAccount(account2);
    }
    public static void displayAccount(Account accountToDisplay){
        System.out.printf("%s's account balance is: $%.2f%n", accountToDisplay.getName(),accountToDisplay.getBalance());
    }
}
