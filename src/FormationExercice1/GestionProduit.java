package FormationExercice1;

import java.util.Map;

public class GestionProduit {
	
	//Initialisation
		public static void initialisationProduit(Map<Integer, Produit> map) {
			map.clear();
			map.put(1, new Produit("CC01","Pomme",100));
			map.put(2, new Produit("CC02","Tomate",50));
			map.put(3, new Produit("CC03","Haricot",60));
			map.put(4, new Produit("CC04","Mangue",40));
			map.put(5, new Produit("CC05","Banane",30));
			map.put(6, new Produit("CC06","Orange",15));
			System.out.println("Produit initialisé !" );
			
			
		}
		
		//Mise à jour du client
		public void miseAJourClient() {
			
		}
		
		//Suppresion d'un Client
	    public void suppressionClient(Integer key) {
			
		}

}
