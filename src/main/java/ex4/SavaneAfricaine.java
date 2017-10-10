package ex4;


public class SavaneAfricaine extends Zone {

	public static final String NOM = "Savane Africaine";
	
	@Override
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 10d;
	}
}
