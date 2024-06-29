package exception;
import java.util.Scanner;

public class Bank {
 double amount;
 double withdrawalamount;
 double deposit;


 
  void balance_chk(double amount) {
	  this.amount=amount;
	  System.out.println("Balance"+amount);
  }
  
  void deposite(double amount,double deposit) {
	  this.amount=amount;
	  this.deposit=deposit;
       System.out.println("Deposite amount: "+deposit);
	  amount=amount+deposit;
	  System.out.println("Total amount"+amount);
  }
  
  void withdrawal(double amount,double withdrawalamount)
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
		double amount,withdrawalamount,depositamount;
		
		Bank f=new Bank();
		 Scanner s=new Scanner(System.in);
		   amount=30000; 
		   System.out.println("Enter deposite amount");
		   depositamount=s.nextDouble();
		   System.out.println("Enter withdrawal amount");
		   withdrawalamount=s.nextDouble();
		f.withdrawal(amount,withdrawalamount);
		f.balance_chk(amount);
		f.deposite(amount,depositamount);
		
		

	}
	}


