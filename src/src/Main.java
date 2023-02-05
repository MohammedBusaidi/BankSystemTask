package src;
import java.util.*;

public class Main {
	static BankAccount newBankAcc = new BankAccount();
	static Menue mainMenue = new Menue();
	
	public static void main(String[] args) {
		 Scanner main = new Scanner(System.in);
		 Menue subM = new Menue();
		 saveToFile save = new saveToFile();

		boolean menueLoop = true;
		while (menueLoop) {
			mainMenue.showMenue();
			int menueInput = main.nextInt();
			while (true) {
				switch(menueInput) {
				case 1:
					boolean subMenueLoop = true;
					while (subMenueLoop) {
						System.out.println("[1]Enter name");
						System.out.println("[2]Enter Account number");
						System.out.println("[3]Go Back");
						int subMenueInput = main.nextInt();
						
						if (subMenueInput == 1) {
							System.out.println("Enter name: ");
							String nameInput = main.next();
							Main.newBankAcc.setAccountHolderName(nameInput);
						}
						else if (subMenueInput == 2) {
							System.out.println("Enter Account number: ");
							Long accNumInput = main.nextLong();
							Main.newBankAcc.setAccountNumber(accNumInput);
						}
						else {
							subMenueLoop = false;
						}
					}
					break;
				case 2:
					System.out.println("Enter the amount you want to withdraw: ");
					double withdrawAmount = main.nextInt();
					newBankAcc.setWithdrawAmount(withdrawAmount);
					newBankAcc.withdraw();
					break;
					
				case 3:
					System.out.println("Enter the amount you want to deposit: ");
					double depositAmount = main.nextInt();
					newBankAcc.setDepositAmount(depositAmount);
					newBankAcc.deposit();
					break;
					
				case 4:
					save.saveData();
					break;
					
				case 5:
					System.out.println("GoodBye");
					menueLoop = false;
				}
				break;
			} 
		}
	}
}
