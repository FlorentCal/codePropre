package ex1;


/**
 * @author Florent Callaou
 *	Util class Calcul
 */
public final class Calcul {

	/**
	 * add 2 numbers given in parameters
	 * @param a : 1st number to add
	 * @param b : 2nd number to add
	 * @return the addition of the 2 numbers
	 */
	public static int add(int a, int b){
		return a + b;
	}
	
	/**
	 * substract 2 numbers given in parameters
	 * @param a : 1st number to substract
	 * @param b : 2nd number to substract
	 * @return the substracion of the 2 numbers
	 */
	public static int substract(int a, int b){
		return a - b;
	}
		
	/**
	 * Private constructor to hit implicit public constructor
	 */
	private Calcul(){
		
	}
}
