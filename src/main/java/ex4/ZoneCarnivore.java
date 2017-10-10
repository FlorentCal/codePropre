package ex4;

public class ZoneCarnivore extends Zone {
		
	public static final String NOM = "Zone Carnivore";
	
	@Override
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 10d;
	}
}
