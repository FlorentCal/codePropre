package ex4;

public class Reptile extends Animal {

	public Reptile(String nom, CategorieComportement comportement) {
		super(nom, comportement);
	}

	@Override
	protected CategorieAnimal getType() {
		return CategorieAnimal.REPTILE;
	}
}
