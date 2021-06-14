package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;


public class Bank {

	List<Customer> users = new ArrayList<Customer>();
	List<MayATM> ATMs = new ArrayList<MayATM>();
	List<DebitCard> debitCards = new ArrayList<DebitCard>();
	List<Account> accounts = new ArrayList<Account>();
	
	

	public Bank() {

		Customer cus1 = new Customer("1", "asssssss");
		Account account = new Account("3141000", 450000);
		DebitCard card = new DebitCard("1234", new Date(2020, 1, 5), "1");

		card.setAccount(account);
		account.setOwerBy(cus1);
		
		

		users.add(cus1);
		debitCards.add(card);
		accounts.add(account);
		

		Customer cus2 = new Customer("2", "Loc");
		Account account2 = new Account("31410000", 4500000);
		DebitCard card2 = new DebitCard("12345", new Date(2020, 1, 5), "1");

		card2.setAccount(account2);
		account2.setOwerBy(cus2);

		users.add(cus2);
		debitCards.add(card2);
		accounts.add(account2);
	}
	
	
	
	
	
	/*
	 * create otp for card
	 */
	public void createOTP_ForCard(Card card) {
		int otp = new Random().nextInt(999999-100000) + 100000;
		card.setOtp(otp);
		System.out.println("Ma OTP cua ban la: "+otp);
	}
	

	/*
	 * get debitCard
	 */
	public DebitCard getDebitCard(String soThe, String pin) {

		DebitCard result = null;
		for (DebitCard card : debitCards)
			if (card.getNo().equals(soThe) && card.getPin().equals(pin)) {
				result = card;
				break;
			}

		return result;
	}

	/*
	 * get account
	 */
	public Account getAccount(String accountNumber) {
		Account account = null;
		for (Account acc : accounts) {
			if (acc.getAccountNumber().equals(accountNumber))
				account = acc;
			break;
		}
		return account;
	}

	
	
	


	
	
	
	


}
