package week2.day4;

public class Amazon extends CanaraBank{
	
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("cash on delivery");
	}

	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("upi payments");

	}

	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("card payments");
	}

	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("internet banking");
	}
	
	
	public static void main(String[] args) {
		Amazon amazon= new Amazon();
		amazon.cardPayments();
		amazon.recordPaymentDetails();
		amazon.upiPayments();
		amazon.internetBanking();
		amazon.cashOnDelivery();
	}

	

}
