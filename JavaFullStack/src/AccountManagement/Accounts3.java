package AccountManagement;

import java.util.Date;
import java.util.List;


public class Accounts3 {
	private int Sno;
	private long accountNumber;
	private String userName;
	private int userPin;
	double balance;
	private List<Transaction> transactions;
	

	
	
	
	public int getSno() {
		return Sno;
	}

	public void setSno(int Sno) {
		this.Sno = Sno;
	}

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

	public int getUserPin() {
		return userPin;
	}

	public void setUserPin(int userPin) {
		this.userPin = userPin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	}




