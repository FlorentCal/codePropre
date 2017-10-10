package ex3;

public class CurrentAccount extends BankAccount {

	public CurrentAccount(double balance, double overdraw) {
		super(balance, overdraw);
	}

	/* (non-Javadoc)
	 * @see ex3.BankAccount#debitAmmount(double)
	 */
	@Override
	public void debitAmmount(double ammount){
		super.balanceControl(ammount, overdraw);	
	}

}
