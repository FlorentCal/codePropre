package ex4;

public class Mammifere extends Animal {

	public Mammifere(String nom, CategorieComportement comportement) {
		super(nom, comportement);
	}

	@Override
	protected CategorieAnimal getType() {
		return CategorieAnimal.MAMMIFERE;
	}

}
