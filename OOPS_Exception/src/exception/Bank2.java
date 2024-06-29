package exception;

import java.util.Scanner;


public class Bank2 {
    double amount; 

    void balance_chk(double amount) {
        this.amount = amount;
        System.out.println("Balance: " + this.amount);
    }

    void accept(double withdrawalamount) throws InsufficientFundsException {
        if (amount < withdrawalamount)
            throw new InsufficientFundsException("Insufficient Funds"); 
        else
            amount -= withdrawalamount;
    }

    void deposit(double deposit) {
        amount += deposit;
        System.out.println("New Balance after deposit: " + amount);
    }

    public static void main(String[] args) {
        double amount, withdrawalamount, deposit;
        Bank2 f = new Bank2();
        Scanner s = new Scanner(System.in); 
        amount = 300; 

        System.out.println("Enter the deposit amount: ");
        deposit = s.nextDouble(); 
        f.deposit(deposit); 

        System.out.println("Enter the withdrawal amount: ");
        withdrawalamount = s.nextDouble(); 

        try {
            f.accept(withdrawalamount);
            System.out.println("New Balance after withdrawal: " + f.amount);
        } catch (InsufficientFundsException e) {
        	e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }
}