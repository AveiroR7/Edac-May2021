abstract class Account{
	int accno;
	String name;
	double balance;
	
	
	public void credit(int amount) {
		this.balance = balance + amount;
	}
	
	public abstract void calculateInterest();
}

class SBIAccount extends Account{
	
	

	@Override
	public void calculateInterest() {
		double rate = 10/100;
		double term = 0.25;	
		double bal = this.balance;
		
		double interest = bal*rate*term;
		balance = balance + interest;
		
	}
}

	class ICICIAccount extends Account
	{
		
 
		public void calculateInterest()
		{
			double rate = 1/100;
			double term = 1.5;	
			double bal = this.balance;
			
			double interest = bal*rate*term;
			balance = balance + interest; 
		} 	
	}
			public class abstractclass {
	
	public static void main(String[] args) {
		
		Account a = new SBIAccount();
		Account b = new ICICIAccount();
		
		a.accno = 1;
		a.balance= 1000;
		a.name = "Rahul Wasnik";
		a.credit(50000);
		a.calculateInterest();
		b.balance= 2000;
		b.name= "Rupali";
		b.credit(25000);
		b.calculateInterest();
		
		System.out.println("Amount: "+a.balance);
		System.out.println("Amount: "+b.balance);
	}

}
