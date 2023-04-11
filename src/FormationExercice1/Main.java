package FormationExercice1;

public class Main {

	public static void main(String[] args) {
		Client client1 = new Client(1,"Dupond","Pierre","Nantes", "0602339232","dupond@gmail.com");
		Client client2 = new Client(2,"Thomas","Paul","Nantes", "0602234232","thomas@gmail.com");
		
		Produit produit1 = new Produit("CC01","Pomme",100);
		Produit produit2 = new Produit("CC02","Tomate",50);
		Produit produit3 = new Produit("CC03","Haricot",60);
		Produit produit4 = new Produit("CC04","Mangue",40);
		Produit produit5 = new Produit("CC05","Banane",30);
		Produit produit6 = new Produit("CC06","Orange",15);
		
		Devis devis1 = new Devis();
		devis1.getListe().add(new DetailDocument(1, 12, produit1 , 100));
		devis1.getListe().add(new DetailDocument(2, 5, produit2 , 50));
		devis1.getListe().add(new DetailDocument(3, 4, produit4 , 40));
		devis1.getListe().add(new DetailDocument(4, 9, produit5 , 30));
		devis1.getListe().add(new DetailDocument(5, 20, produit6 , 15));
		
		System.out.println("Total devis1 "+devis1.calculMontant()+"€");

	}

}
