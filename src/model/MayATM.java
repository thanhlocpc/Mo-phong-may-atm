package model;

import model.state.stateATM.*;
public class MayATM {
	
	private String address;
	private double totalMoney;
	
	private ReceiptPrinter receiptPrinter;
	
	
	/*
	 * trang thai chưa khoi dong
	 * trang thai khoi dong nhung chua gan the
	 * trang thai da gan the
	 */
	private State status;


	public MayATM(String address, double totalMoney) {
		this.address = address;
		this.totalMoney = totalMoney;
	}
	
	
	
	
	
	
}
