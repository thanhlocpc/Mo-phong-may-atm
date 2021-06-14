package model;

public class Receipt {
	private static long receiptNum = 1000000;
	private String content;

	

	public Receipt( String bill) {
		this.receiptNum++;
		this.content = bill;
	}



	@Override
	public String toString() {
		return "So hoa don:\t" +receiptNum +"\n"+content;
	}
	
	
	
}
