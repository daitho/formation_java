package OC;

//Dans Cette class nous allons voir la notion d'héritage et de polymorphisme

public class OpenC2 {

	public static void main(String[] args) {
		Voiture voiture = new Voiture();
		voiture.start();
		
		Bateau bateau = new Bateau();
		bateau.start();
		

	}

}

class Vehicule{
	void start() {
		System.out.println("VR0000000M");
	}
}

class Voiture extends Vehicule{
	
	@Override
	void start() {
		super.start();
		allumerfeux();
	}
	
	void allumerfeux() {
		System.out.println("Allumage feux!");
	}
	
}

class Bateau extends Vehicule{
	
}