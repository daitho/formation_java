package FormationExercice1;

import java.util.HashMap;
import java.util.Map;

public class GestionProduit {
	private Map<Integer, Produit> map;
	
	//Initialisation
		public void initialisationProduit() {
			map = new HashMap<Integer, Produit>();
			map.put(1, new Produit("CC01","Pomme",100));
			map.put(2, new Produit("CC02","Tomate",50));
			map.put(3, new Produit("CC03","Haricot",60));
			map.put(4, new Produit("CC04","Mangue",40));
			map.put(5, new Produit("CC05","Banane",30));
			map.put(6, new Produit("CC06","Orange",15));
			System.out.println("Produit initialisé !" );
			
			
		}
		
		//Ajout d'un produit
		public void ajoutProduit(int key, Produit produit) {
			boolean ajouter = false;
			for (Map.Entry<Integer, Produit> entry : map.entrySet()) {
				if(entry.getKey().equals(key) || entry.getValue().getCodeProduit().equals(produit.getCodeProduit())) {
					ajouter = true;
				}
			}
			
			if(ajouter == true) {
				System.out.println("Une erreur s'est produit lors de l'ajout du produit !" );
			}else {
				map.put(key, produit);
				System.out.println("produit ajouter !" );
			}
		}
		
		//Retrouver un Client
	    public Produit retrouverProduit(Integer key) {
			return map.get(key);
		}
		
		//Mise à jour du produit
		public void miseAJourProduit(int key, Produit produit) {
			if(produit != null) {
				map.replace(key, produit);
				System.out.println("Produit mise à jour !" );
			}
		}
		
		//Suppresion d'un produit
	    public void supprimerProduit(Integer key) {
			map.remove(key);
		}
	    
	  //afficher Produit
	    public void afficherProduit(Integer key) {
	    	System.out.println("Code: "+map.get(key).getCodeProduit()+", Libelle: "+map.get(key).getLibelle()+", Prix: "+map.get(key).getPrix());
		}

}
