package src;

public class BankAccount {
	private Long accountNumber;
	private String accountHolderName;
	private double balance;
	private double depositAmount;
	private double withdrawAmount;
	double limit = 100;

	//getter
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	
	//setter
	public void setAccountHolderName(String accName) {
		this.accountHolderName = accName;
	}
	public void setAccountNumber(Long accNum) {
		this.accountNumber = accNum;
	}
	public void setBalance(double accBalance) {
		this.balance = accBalance;
	}
	public void setDepositAmount(double accDepositAmount) {
		this.depositAmount = accDepositAmount;
	}
	public void setWithdrawAmount(double accWithdrawAmount) {
		this.withdrawAmount = accWithdrawAmount;
	}
	
	public double deposit() {
		this.setBalance(this.getBalance() + this.getDepositAmount());
		System.out.println("Amount Deposited, your balance now is: " + this.getBalance());
		return balance;
	}
	public double withdraw() {
		try {
		    if (this.getWithdrawAmount() > this.getBalance()) {
		        throw new Exception("Insufficient Funds");
		    } else if ( this.getWithdrawAmount() > 100) {
		    	System.out.println("Amount exceeded the limit");
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
