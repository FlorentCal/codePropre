package ex4;

public abstract class Animal {

	/** nom : String */
	private String nom;
	/** comportement : CategorieComportement */
	private CategorieComportement comportement;
	
	/**
	 * Constructeur d'Animal
	 * @param nom
	 * @param comportement
	 */
	public Animal(String nom, CategorieComportement comportement) {
		super();
		this.nom = nom;
		this.comportement = comportement;
	}

	/**
	 * @return le type de l'animal
	 */
	protected abstract CategorieAnimal getType();
	
	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter for nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter for comportement
	 * @return the comportement
	 */
	public CategorieComportement getComportement() {
		return comportement;
	}

	/** Setter for comportement
	 * @param comportement the comportement to set
	 */
	public void setComportement(CategorieComportement comportement) {
		this.comportement = comportement;
	}	
	
}
