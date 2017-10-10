package ex1;

import java.time.LocalDate;

/**
 * @author Florent Callaou
 * Entrepise Class
 */
public class Entreprise {

	/** siret : int */
	private int siret;
	/** name : String */
	private String name;
	/** adress : String */
	private String adress;
	/** creationDate : LocalDate */
	private LocalDate creationDate;	
	
	/** capitalMax : int */
	private static final int CAPTITAL_MAX = 3_000_000;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Entreprise [Siret : " + siret + ", Name : " + name + ", Adress : " + adress + ", Creation date : " + creationDate + ", Capital Max : " + CAPTITAL_MAX + "]";
	}

	/** Getter for siret
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/** Setter for siret
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/** Getter for name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/** Setter for name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** Getter for adress
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}

	/** Setter for adress
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}

	/** Getter for creationDate
	 * @return the creationDate
	 */
	public LocalDate getCreationDate() {
		return creationDate;
	}

	/** Setter for creationDate
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

}
