package FormationExercice1.gestion;

import FormationExercice1.Client;
import FormationExercice1.Commande;

public class GestionCommande extends GestionDocument{
	//private Map<Integer, Commande> map = new HashMap<Integer, Commande>();
	
	public boolean verifierCommande(Commande commande) {
		return  super.verifierDocument(commande);
	}
	
	public Commande ajouterCommande(int code, Client client) {
		Commande commande = new Commande();
		commande.setCode(code);
		commande.setClient(client);
		
		return (Commande) ajouterDocument(commande);
	}
	
	public void supprimerCommande(Commande commande) throws Exception {
		if(super.supprimerDocument(commande)) {
			System.out.println("Commande supprimée !");
		}else {
			System.err.println("Erreur de suppréssion: Commande non supprimée !");
		}
	}
	
	public Commande retrouverCommande(String key) {
		return  (Commande) retrouverDocument(getKey(key));
	}
	
	
	public String getKey(String key) {
		return "Facture-"+key;
	}


}
