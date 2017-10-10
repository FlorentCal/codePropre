package ex4;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Florent Callaou
 * Classe Zoo
 */
public class Zoo {

	/** zones : Map<String,Zone> */
	private Map<String, Zone> zones;
	/** nom : String */
	private String nom;
	
	/**
	 * Constructeur de Zoo
	 * @param nom
	 */
	public Zoo(String nom){
		this.nom = nom;
		this.zones = new HashMap<>();
			
		this.zones.put(ZoneCarnivore.NOM, new ZoneCarnivore());
		this.zones.put(SavaneAfricaine.NOM, new SavaneAfricaine());
		this.zones.put(FermeReptile.NOM, new FermeReptile());
		this.zones.put(Aquarium.NOM, new Aquarium());
	}
	
	/**
	 * Ajoute un animal dans la zone adequat
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		
		if (animal.getType().equals(CategorieAnimal.MAMMIFERE) && animal.getComportement().equals(CategorieComportement.CARNIVORE)){
			zones.get(ZoneCarnivore.NOM).addAnimal(animal);
		}
		else if (animal.getType().equals(CategorieAnimal.MAMMIFERE) && animal.getComportement().equals(CategorieComportement.HERBIVORE)){
			zones.get(SavaneAfricaine.NOM).addAnimal(animal);
		}
		else if (animal.getType().equals(CategorieAnimal.REPTILE)){
			zones.get(FermeReptile.NOM).addAnimal(animal);
		}
		else if (animal.getType().equals(CategorieAnimal.POISSON)){
			zones.get(Aquarium.NOM).addAnimal(animal);
        }
					
	}
	
	/**
	 * Affiche la liste des animaux par zone
	 * @param nomZone
	 */
	public void afficherListe(String nomZone){
		zones.get(nomZone).afficherListeAnimaux();
	}

	/** Getter for zones
	 * @return the zones
	 */
	public Map<String, Zone> getZones() {
		return zones;
	}

	/** Setter for zones
	 * @param zones the zones to set
	 */
	public void setZones(Map<String, Zone> zones) {
		this.zones = zones;
	}

	
}
