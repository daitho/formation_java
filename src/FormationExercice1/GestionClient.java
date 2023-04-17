package FormationExercice1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionClient {
	
	private Map<Integer, Client> mapClient;
	
	
	//Initialisation
	public  void initialisationClient() {
		mapClient = new HashMap<Integer, Client>();
		ajoutClient(new Client(1,"Dupond","Pierre","Nantes", "0602339232","dupondp@gmail.com"));
		ajoutClient(new Client(2,"Thomas","Paul","Paris", "0602234232","thomaspa@gmail.com"));
		ajoutClient(new Client(3,"Jean","Joseph","Limoges", "0604565332","jeanjo@gmail.com"));
		System.out.println("Client initialisé !" );
		
		
	}
	
	//Ajout d'un client
	public void ajoutClient(Client client) {
		
		if(!verifierClient(client)) {
			mapClient.put(client.getIdClient(), client);
			System.out.println("Client ajouté !" );
		}else {
			System.out.println("Une erreur s'est produit lors de l'ajout du client !" );
		}
		
	}
	
	//Retrouver un Client
    public Client retrouverClient(Integer key) {
		return mapClient.get(key);
	}
	
	//Mise à jour du client
	public void miseAJourClient(Client client) {
		if(verifierClient(client)) {
			mapClient.replace(client.getIdClient(), client);
			System.out.println("Client mise à jour !" );
		}
	}
	
	//Pour verifier si le client existe
	private boolean verifierClient(Client client) {
		return client != null && mapClient.containsKey(client.getIdClient());
	}
	
	//Suppresion Client
    public void supprimerClient(Client client) {
    	if(verifierClient(client)) {
    		mapClient.remove(client.getIdClient());
    		System.out.println("Client supprimé !");
    	}
    	else {
    		System.out.println("Client introuvable !");
    	}
	}
    
    //afficher Client
    public void afficherClient(Client client) {
    	if(verifierClient(client)) {
    		System.out.println("Nom: "+client.getNom()+", Prénom: "+client.getPrenom()+", Ville: "+client.getAdresse()+", Telephone: "+client.getTelephone()+", Email: "+client.getEmail());
    	}else {
    		System.err.println("Client introuvable !");
    	}
    	
	}
    
    public void afficherClient(int key) {
    	afficherClient(retrouverClient(key));
    	
	}
    
    public void afficherClient(List<Client> clients) {
    	for(Client client : clients) {
    		afficherClient(client);
    	}
    	
	}
    
    public List<Client> rechercherClientsParNom(String nom){
    	List<Client> clients = new ArrayList<>();
    	for(Client client : mapClient.values()) {
    		if(client.getNom().contains(nom)) {
    			clients.add(client);
    		}
    	}
    	return clients;
    }
    
    public List<Client> rechercherClientParEmail(String email){
    	List<Client> clients = new ArrayList<>();
    	for(Client client : mapClient.values()) {
    		if(client.getEmail().contains(email)) {
    			clients.add(client);
    		}
    	}
    	return clients;
    }

}
