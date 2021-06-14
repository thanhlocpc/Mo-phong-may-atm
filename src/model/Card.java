package model;

import java.util.Date;
import java.util.Random;

public abstract class Card {
	private String no;       // so the
	private String pin;         // ma pin
	private Date expireDate;// ngay het hạn
	protected Account account; // tai khoan thanh toan
	
	private int otp;
	private Random random;
	
	public Card(String no, Date expireDate, String pin) {
		this.no = no;
		this.expireDate = expireDate;
		this.pin = pin;
		random = new Random();
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Date getExpireDate() {
		return expireDate;
	}
	
	
	public void setOtp(int otp) {
		this.otp = otp;
	}

	public int getOTP() {
		return otp;
	}
	
}
