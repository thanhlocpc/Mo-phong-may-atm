package model;

import java.util.ArrayList;
import java.util.List;


public class Account{
	private String accountNumber; // stk
	private double balance;      // so du
	private Customer owerBy;	// chu so huu
	
	
	
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getOwerBy() {
		return this.owerBy;
	}
	public void setOwerBy(Customer owerBy) {
		this.owerBy = owerBy;
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
}
