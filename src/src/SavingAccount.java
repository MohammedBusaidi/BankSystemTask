package src;

public class SavingAccount extends BankAccount{
	public double interest;
	public double rate;
	
	  public double calculateIntrest(double rate, double time) {
		  interest = this.getBalance() * rate * time;
		  System.out.println("Intrest Earned: " + interest);
		  return interest;
	  }
}
