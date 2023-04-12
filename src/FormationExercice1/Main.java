package FormationExercice1;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		//Initialisation de Client
		Map<Integer, Client> mapClient = new HashMap<Integer, Client>();
		GestionClient.initialisationClient(mapClient);
		
		//Initialisation de       Produit
		Map<Integer, Produit> mapProduit = new HashMap<Integer, Produit>();
		GestionProduit.initialisationProduit(mapProduit);
		System.out.println();
		
		Devis devis1 = new Devis();
		devis1.setClient(mapClient.get(1));
		devis1.getListe().add(new DetailDocument(1, 12, mapProduit.get(1) ));
		devis1.getListe().add(new DetailDocument(2, 5, mapProduit.get(2)));
		devis1.getListe().add(new DetailDocument(3, 4, mapProduit.get(4)));
		devis1.getListe().add(new DetailDocument(4, 9, mapProduit.get(5)));
		devis1.getListe().add(new DetailDocument(5, 20, mapProduit.get(6)));
		
		System.out.println("Nom du client: "+devis1.getClient().getNom()+" "+devis1.getClient().getPrenom());
		System.out.println("Total devis1 "+devis1.calculMontant()+"€");
		
		Commande commande1 = new Commande();
		commande1.setClient(mapClient.get(1));
		commande1.getListe().add(new DetailDocument(1, 11, mapProduit.get(3)));
		commande1.getListe().add(new DetailDocument(2, 10, mapProduit.get(5)));
		commande1.getListe().add(new DetailDocument(3, 20, mapProduit.get(6)));
		
		System.out.println("Nom et prénom: "+devis1.getClient().getNom()+" "+devis1.getClient().getPrenom());
		System.out.println("Total commande1 "+commande1.calculMontant()+"€");

	}

}
