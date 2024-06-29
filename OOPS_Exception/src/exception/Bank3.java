 package exception;
import java.util.Scanner;

//create a custom exception class that extends Exception
class InsufficientFundsException extends Exception {
  public InsufficientFundsException(String message) {
    super(message);
  }
} 

public class Bank3{
  double amount; //class field to store the bank account balance
  double withdrawalamount;
  double deposit;
 
  //method to check the balance of the bank account
  void balance_chk(double amount) {
    this.amount=amount;
    System.out.println(this.amount); //print the balance
  }
  
  //method to deposit money to the bank account
  void deposit(double amount,double deposit) {
    this.amount=amount;
    this.deposit=deposit;
    this.amount=amount+deposit; //update the class field with the new balance
    System.out.println(this.amount); //print the new balance
  }
  void withdrawalamount(double amount,double withdrawalamount)
    
	  throws InsufficientFundsException{
			 this.withdrawalamount=withdrawalamount;
			 this.amount=amount;
			 if(amount<withdrawalamount)
			 throw new InsufficientFundsException("Insufficient Funds"); 
			 else
				 amount=amount-withdrawalamount;
			 
				 System.out.println("Withdrawal :"+amount);
		 

  }
  
  public static void main(String[] args) throws InsufficientFundsException{
    double amount,withdrawalamount,deposit;
   
    Bank3 f=new Bank3();
    Scanner s=new Scanner(System.in); //create a Scanner object to get user input
    amount=3000; //initialize the amount variable with the initial balance
    System.out.println("Enter the deposit amount: ");
    deposit=s.nextDouble(); //get the user input for the deposit amount
    System.out.println("Enter the withdrawal amount: ");
    withdrawalamount=s.nextDouble(); //get the user input for the withdrawal amount
    
    
    f.balance_chk(amount); //call the balance_chk method with the amount
    f.deposit(amount,deposit); //call the deposit method with the amount and the deposit amount
    f.withdrawalamount(amount,withdrawalamount);
    
  

  }

}
