package ex4;

public class Poisson extends Animal {

	public Poisson(String nom, CategorieComportement comportement) {
		super(nom, comportement);
	}
	
	@Override
	protected CategorieAnimal getType() {
		return CategorieAnimal.POISSON;
	}

}
