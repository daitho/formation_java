package Figure;

public class Main {

	public static void main(String[] args) {
		Carre carre = new Carre(4);
		carre.moveTo(4, 4);
		
		System.out.println("Coté : "+carre.getCote());
		System.out.println("Périmètre : "+carre.getPerimetre());
		

	}

}

