package src;
import java.io.File;
import java.io.FileWriter;
public class saveToFile {
		public void saveData() {
		    try {
		    	File file = new File("C:\\Users\\Lenovo\\eclipse-workspace\\BankAccount\\src\\src\\data.txt");
		    	FileWriter writer = new FileWriter(file, true);
		    	
				writer.write(String.format("%20s %20s %20s %20s %20s\n", "Account name", "Account number", "Balance", "Deposit Amount", "Withdraw Amount"));
				writer.write(String.format("%20s %20s %20s %20s %20s\n", 
						Main.newBankAcc.getAccountHolderName(),
						Main.newBankAcc.getAccountNumber(),
						Main.newBankAcc.getBalance(),
						Main.newBankAcc.getDepositAmount(),
						Main.newBankAcc.getWithdrawAmount()
						));
		        writer.close();
		        System.out.println("DATA SAVED TO FILE!");
		    } catch(Exception e) {
		    	System.out.println("ERROR!");
		        e.printStackTrace();
		    }
		} 
}

