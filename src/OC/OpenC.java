package OC;

public class OpenC {

	public static void main(String[] args) {
		Marque apple = new Marque("apple");
		
		Telephone iphone = new Telephone(450000, "iphone", apple);
		
		System.out.println(iphone.nom);
		System.out.println(iphone.toString());

	}

}

class Telephone{
	int pixels;
	String nom;
	Marque marque;
	
	public Telephone(int pixels, String nom, Marque marque) {
		this.pixels = pixels;
		this.nom = nom;
		this.marque = marque;
	}

	@Override
	public String toString() {
		return "Telephone [pixels = " + pixels + ", nom = " + nom + ", marque = " + marque.nom + "]";
	}
	
	
	
	
}

class Marque{
	String nom;
	
	public Marque(String nom) {
		this.nom = nom;
	}
}
