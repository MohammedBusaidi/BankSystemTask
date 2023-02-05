package src;

public class CheckingAccount extends BankAccount{
	private double limit = 100;
	public void limit(double limit) {
		this.limit = limit;
	}
	public double limit() {
		return limit;
	}
	public double withdraw(double withdrawAmount) {
		
        if (withdrawAmount > this.getBalance() + this.limit()) {
            System.out.println("Withdrawal amount exceeded the limit");
            return withdrawAmount;
        } 
       
        else {
            this.setBalance(this.getBalance() - withdrawAmount);
        }
        return withdrawAmount;
	}
}
