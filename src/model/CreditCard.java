package model;

import java.util.Date;

public class CreditCard extends Card{
	
	private double limit;

	public CreditCard(String no, Date expireDate, String pin, double limit) {
		super(no, expireDate, pin);
		this.limit = limit;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	
	

}
