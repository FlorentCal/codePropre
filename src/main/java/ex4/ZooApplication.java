package ex4;

public class ZooApplication {

	static Zoo zoo = new Zoo("Thoiry");
	
	public static void main(String[] args) {
		
		zoo.addAnimal(new Mammifere("Gazelle", CategorieComportement.HERBIVORE));
		zoo.addAnimal(new Mammifere("Zèbre", CategorieComportement.HERBIVORE));
		zoo.addAnimal(new Mammifere("Lion", CategorieComportement.HERBIVORE));
		zoo.addAnimal(new Mammifere("Panthère", CategorieComportement.CARNIVORE));
		zoo.addAnimal(new Poisson("Requin blanc", CategorieComportement.HERBIVORE));
		zoo.addAnimal(new Poisson("Truite dorée", CategorieComportement.HERBIVORE));
		zoo.addAnimal(new Reptile("Boa constrictor", CategorieComportement.CARNIVORE));
		zoo.addAnimal(new Reptile("Python", CategorieComportement.CARNIVORE));
		
		affichageParZone(ZoneCarnivore.NOM);
		affichageParZone(SavaneAfricaine.NOM);
		affichageParZone(Aquarium.NOM);
		affichageParZone(FermeReptile.NOM);
	}

	public static void affichageParZone(String zone){
		System.out.println(zone + " :");
		zoo.afficherListe(zone);
		System.out.println("Combien d'animaux : " + zoo.getZones().get(zone).compterAnimaux());
		System.out.println("Combien de bouffe par jour : " + zoo.getZones().get(zone).calculerKgsNourritureParJour());
		System.out.println("--------------------------------------------------------------");
	}
	
}


