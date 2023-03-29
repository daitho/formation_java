package OC;

//Dans Cette class nous allons voir la notion d'héritage
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
	
}

class Bateau extends Vehicule{
	
}