package src;

public class CheckingAccount extends BankAccount {
	
	public double withdraw(double withdrawAmount) {
		
		try {
		    if (this.getWithdrawAmount() > this.getBalance() || this.getWithdrawAmount() > 100) {
		        throw new Exception("Insufficient Funds");
		    } else {
		        this.setBalance(this.getBalance() - this.getWithdrawAmount());
		        System.out.println("Amount Withdrawn, your balance now is: " + this.getBalance());
		    }
		} catch (Exception e) {
		    System.out.println("Something went wrong, please try again.");
		}
		return withdrawAmount;
	}
}
