import java.io.*;

public class Bank{
	public static void main(String[] args){
		try{
			CurrentAccount ca = new CurrentAccount();

			ca.setCustomerName("Rishav Kumar");
			ca.setAccountNumber("16SCSE101436SBI");
	
			ca.depositBalance(10_000);
	
			ca.displayBalance();

			SavingAccount sa = new SavingAccount();

			sa.setCustomerName("Rishav Singhania");
			sa.setAccountNumber("1613101574SBI");

			sa.depositBalance(50_000);

			System.out.println(sa.getCompoundInterest());
	}catch(Exception ex){
			System.out.println("Oops...!!");
			System.out.println(ex);
	}
   }
}

class Account{
	private String customerName;
	private String accountType;
	private String accountNumber;

	public void setCustomerName(String customerName){
			this.customerName = customerName;
	}

	public void setAccountType(String accountType){
			this.accountType = accountType;
	}

	public void setAccountNumber(String accountNumber){
			this.accountNumber = accountNumber;
	}

}

class CurrentAccount extends Account{
	private int balance;
	private final int min_balance = 3000;
	private final int penalty = 2; //2% penalty wil be charged if balace is less than minimum...
	
	public void depositBalance(int balance){
		this.balance += balance;
	}

	public void displayBalance(){
		System.out.println(this.balance);
	}

	public void withdrawal(int amount){
		this.balance -= amount;

		if(balance < min_balance){
			this.balance = this.balance * penalty/100;
		}
			
	}

	public CurrentAccount(){
		super.setAccountType("Current Account");
	}

}

class SavingAccount extends Account{
	private int balance;
	private final int interest = 5; //interest percentage;	

	public void depositBalance(int balance){
		this.balance += balance;
	}

	public void displayBalance(){
		System.out.println(this.balance);
	}

	public void withdrawal(int amount){
		this.balance -= amount;
	}

	public SavingAccount(){
		super.setAccountType("Saving Account");
	}

	public int getCompoundInterest(){
		 return (balance * interest * 1) / 100; 
	/**
	i know it's simple interest formula but no time to implement coumpund interest formual it's massive 	        ...really sorry :-(
	*/

	}
}
