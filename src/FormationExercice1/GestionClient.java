package FormationExercice1;

import java.util.HashMap;
import java.util.Map;

public class GestionClient {
	
	private Map<Integer, Client> mapClient;
	
	
	//Initialisation
	public  void initialisationClient() {
		mapClient = new HashMap<Integer, Client>();
		mapClient.put(1, new Client(1,"Dupond","Pierre","Nantes", "0602339232","dupondp@gmail.com"));
		mapClient.put(2, new Client(2,"Thomas","Paul","Paris", "0602234232","thomaspa@gmail.com"));
		mapClient.put(3, new Client(3,"Jean","Joseph","Limoges", "0604565332","jeanjo@gmail.com"));
		System.out.println("Client initialisé !" );
		
		
	}
	
	//Ajout d'un client
	public void ajoutClient(int key, Client client) {
		boolean ajouter = false;
		for (Map.Entry<Integer, Client> entry : mapClient.entrySet()) {
			if(entry.getKey().equals(key) || entry.getValue().getEmail().equals(client.getEmail()) || entry.getValue().getIdClient() == client.getIdClient()) {
					ajouter = true;
				
			}
		}
		if(ajouter == true) {
			System.out.println("Une erreur s'est produit lors de l'ajout du client !" );
		}else {
			mapClient.put(key, client);
			System.out.println("Client ajouter !" );
		}
	}
	
	//Retrouver un Client
    public Client retrouverClient(Integer key) {
		return mapClient.get(key);
	}
	
	//Mise à jour du client
	public void miseAJourClient(int key, Client client) {
		if(client != null) {
			mapClient.replace(key, client);
			System.out.println("Client mise à jour !" );
		}
	}
	
	//Suppresion Client
    public void supprimerClient(Integer key) {
		mapClient.remove(key);
	}
    
  //afficher Client
    public void afficherClient(int key) {
    	System.out.println("Nom: "+mapClient.get(key).getNom()+", Prénom: "+mapClient.get(key).getPrenom()+", Ville: "+mapClient.get(key).getAdresse()+", Telephone: "+mapClient.get(key).getTelephone()+", Email: "+mapClient.get(key).getEmail());
	}

}
