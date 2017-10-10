package ex2;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Florent Callaou
 *	Manage the count 
 */
public class CountStock {

	/** LOG : Logger */
	private static final Logger LOG = LoggerFactory.getLogger(CountStock.class);	

	/** numberElements : int */
	private int numberElements;
	/** result : double */
	private double result;
	/** beginCountDate : LocalDateTime */
	private LocalDateTime beginCountDate;
	/** endCountDate : LocalDateTime */
	private LocalDateTime endCountDate;

	public CountStock(int numberElements, double result, LocalDateTime beginCountDate, LocalDateTime endCountDate) {
		super();
		this.numberElements = numberElements;
		this.result = result;
		this.beginCountDate = beginCountDate;
		this.endCountDate = endCountDate;
	}

	/**
	 * Add ammount to the result
	 * @param ammount
	 */
	public void addAmmount(int ammount){
		numberElements++;
		result +=ammount;
	}

	/**
	 * Display count status
	 * @param countType : the type of count (SOMME, MOYENNE)
	 */
	public void displayCountStatus(CountType countType){

		if (numberElements == 0){
			LOG.info("Le comptage n'a pas d'éléments. Le comptage est en anomalie.");
			throw new RuntimeException("Le comptage n'a pas d'éléments. Le comptage est en anomalie.");
		}
		if(beginCountDate == null){
			throw new RuntimeException("Le comptage n'a pas de date de début. Le comptage est en anomalie.");
		}

		displayEndCountDate();

		displayResult(countType);

		displayBeginCountDate();

	}

	/**
	 * display the endCountDate
	 */
	private void displayEndCountDate() {
		if (endCountDate!=null){
			LOG.info("Le comptage est clos depuis le " + endCountDate);
		}
		else {
			LOG.info("Le compte est actif.");
		}
	}

	/**
	 * display the result considering countType
	 * @param countType : the type of count (SOMME, MOYENNE)
	 */
	private void displayResult(CountType countType) {
		if(countType.equals(CountType.SOMME)){
			displayResultAndNumber("SOMME", result);
		} else if(countType.equals(CountType.MOYENNE)){
			displayResultAndNumber("MOYENNE", result/numberElements);
		}
	}


	/**
	 * display the result and numberElements considering countType
	 * @param type : the type of count (SOMME, MOYENNE)
	 * @param result : the result to display
	 */
	private void displayResultAndNumber(String type, double result){
		LOG.info("Ce comptage est de type : " + type);
		LOG.info("Nombre d'élements : " + numberElements);
		LOG.info("Résultat : " + result);
	}

	/**
	 * display the beginCountDate
	 */
	private void displayBeginCountDate() {
		LOG.info(DateUtils.format(beginCountDate, "dd/MM/yyyy HH:mm:ss"));
	}

}
