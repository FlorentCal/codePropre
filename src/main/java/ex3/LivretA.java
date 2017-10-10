package ex3;

/** Représente un compte bancaire de type Livret A
 * @author DIGINAMIC
 */
public class LivretA extends BankAccount {

	/** wageRate : double */
	private double wageRate;
	
	/** OVERDRAW : double */
	private static final double OVERDRAW = 0;
	
	/**
	 * Constructor
	 * @param balance
	 * @param wageRate
	 */
	public LivretA(double balance, double wageRate) {
		super(balance, OVERDRAW);
		this.wageRate = wageRate;
	}
	
	/**
	 * Apply the annual LivretA remuneration
	 */
	public void applyAnnualRemu(){
		this.balance = balance + balance*wageRate/100;
	}
	
	/* (non-Javadoc)
	 * @see ex3.BankAccount#debitAmmount(double)
	 */
	@Override
	public void debitAmmount(double ammount){
		balanceControl(ammount, OVERDRAW);
	}		
	
	/** Getter for wageRate
	 * @return the wageRate
	 */
	public double getWageRate() {
		return wageRate;
	}

	/** Setter for wageRate
	 * @param wageRate the wageRate to set
	 */
	public void setWageRate(double wageRate) {
		this.wageRate = wageRate;
	}
	

}
