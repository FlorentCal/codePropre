package ex3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppBankAccount {

	/** LOG : Logger */
	private static final Logger LOG = LoggerFactory.getLogger(AppBankAccount.class);	

	
	public static void main(String[] args) {
		BankAccount livretA = new LivretA(50000, 0.5);

		BankAccount currentAccount = new CurrentAccount(50000, 100);
		
		livretA.addAmmount(1);		
		LOG.info(livretA.getBalance() +"");
		livretA.debitAmmount(500);
		((LivretA) livretA).applyAnnualRemu();
		LOG.info(livretA.getBalance() +"");
		
		currentAccount.addAmmount(1);
		LOG.info(currentAccount.getBalance() +"");
		currentAccount.debitAmmount(49903);
		LOG.info(currentAccount.getBalance() +"");
		
	}

}
