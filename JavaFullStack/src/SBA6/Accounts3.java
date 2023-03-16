package SBA6;

import java.util.Date;
import java.util.List;

public class Accounts3 extends Message2 implements Display1{
	private long accountNumber;
	private String userName;
	private int userPassword;
	private double balance;
	private List<Transaction> transactions;
	

	@Override
	public void display() {
		System.out.println("WELCOME TO XYZ BANK");
	}
	
	/*Accounts3(long accountNumber,String userName,String userPassword,double balance) {
		this.accountNumber=accountNumber;
		this.userName=userName;
		this.userPassword=userPassword;
		this.balance=balance;
		this.transactions=transactions;
	}*/

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(int userPassword) {
		this.userPassword = userPassword;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

class Transaction {
	

	private Date date;
	private String typeOfTransaction;
	private double amount;
	private int accountId;
	
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public Date getDate() {
		return date;
	}

	public String getTypeOfTransaction() {
		return typeOfTransaction;
	}


	public double getAmount() {
		return amount;
	}

	public Transaction(int accountId,Date date, String typeOfTransaction, double amount) {
		super();
		this.accountId=accountId;
		this.date = date;
		this.typeOfTransaction = typeOfTransaction;
		this.amount = amount;
	}	
	
}

}