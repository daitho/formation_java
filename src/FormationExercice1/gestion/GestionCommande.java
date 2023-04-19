package FormationExercice1.gestion;

import FormationExercice1.Client;
import FormationExercice1.Commande;
import FormationExercice1.DetailDocument;
import FormationExercice1.Facture;

public class GestionCommande extends GestionDocument{
	//private Map<Integer, Commande> map = new HashMap<Integer, Commande>();
	
	public boolean verifierCommande(Facture facture) {
		return  super.verifierDocument(facture);
	}
	
	public Commande ajouterCommande(int code, Client client) {
		Commande commande = new Commande();
		commande.setCode(code);
		commande.setClient(client);
		
		return (Commande) ajouterDocument(commande);
	}
	
	public void ajouterLigneProduit(Commande commande, DetailDocument detailDocument) {
			ajouterLigneProduit(commande, detailDocument);
	}
	
	public Commande retrouverCommande(String key) {
		return  (Commande) retrouverDocument(getKey(key));
	}
	
	
	public String getKey(String key) {
		return "Facture-"+key;
	}


}
