package FormationExercice1;

import java.util.Map;

public class GestionClient {
	
	
	//Initialisation
	public static void initialisationClient(Map<Integer, Client> map) {
		map.clear();
		map.put(1, new Client(1,"Dupond","Pierre","Nantes", "0602339232","dupondp@gmail.com"));
		map.put(2, new Client(2,"Thomas","Paul","Paris", "0602234232","thomaspa@gmail.com"));
		map.put(3, new Client(3,"Jean","Joseph","Limoges", "0604565332","jeanjo@gmail.com"));
		System.out.println("Client initialisé !" );
		
		
	}
	
	//Mise à jour du client
	public void miseAJourClient() {
		
	}
	
	//Suppresion Client
    public void suppressionClient(Integer key) {
		
	}
	// Mise à jour devis, facture et commande
	
	//Suppression Client, devis facture et commande

}
