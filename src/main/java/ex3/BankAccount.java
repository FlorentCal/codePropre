package ex3;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class BankAccount {

	/** solde : solde du compte */
	protected double balance;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	protected double overdraw;
		
	/**
	 * @param balance
	 * @param overdraw
	 */
	public BankAccount(double balance, double overdraw) {
		super();
		this.balance = balance;
		this.overdraw = overdraw;
	}
	
	/** Ajoute un montant au solde
	 * @param ammount
	 */
	public void addAmmount(double ammount){
		this.balance += ammount;
	}
	
	/** Ajoute un montant au solde
	 * @param ammount : ammount to debit
	 */
	public void debitAmmount(double ammount){
		balanceControl(ammount, overdraw);	
	}
		
	/**
	 * Control if if the debit is allowed considering the overdraw
	 * @param ammount : ammount to debit
	 * @param overdraw : overdraw
	 */
	protected void balanceControl(double ammount, double overdraw) {
		if (this.balance - ammount > overdraw){
			this.balance = balance - ammount;
		}
	}

	/** Getter for balance
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/** Setter for balance
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/** Getter for overdraw
	 * @return the overdraw
	 */
	public double getOverdraw() {
		return overdraw;
	}

	/** Setter for overdraw
	 * @param overdraw the overdraw to set
	 */
	public void setOverdraw(double overdraw) {
		this.overdraw = overdraw;
	}
	
}
