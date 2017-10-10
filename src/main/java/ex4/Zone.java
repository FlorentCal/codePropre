package ex4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Florent Callaou
 * Zone d'un Zoo
 */
public class Zone {

	/** animaux : List<Animal> */
	protected List<Animal> animaux;
	
	/**
	 * Conbstructeur de Zone
	 */
	public Zone() {
		super();
		animaux = new ArrayList<>();
	}

	/**
	 * Ajoute un animal à la liste
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		animaux.add(animal);
	}
	
	/**
	 * Affiche chaque animaux de la liste
	 */
	public void afficherListeAnimaux(){
		for (Animal animal : animaux){
			System.out.println(" - " + animal.getNom());
		}
	}
	
	/**
	 * Caclucl la quantité de nourriture par jour nécessaire
	 * @return
	 */
	public double calculerKgsNourritureParJour(){
		return 0;
	}
	
	/**
	 * Compte le nombre d'animaux par zone
	 * @return le nombre d'animaux
	 */
	public int compterAnimaux(){
		return animaux.size();
	}

	
}
