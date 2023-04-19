package FormationExercice1.gestion;

import FormationExercice1.Client;
import FormationExercice1.DetailDocument;
import FormationExercice1.Facture;

public class GestionFacture extends GestionDocument{
	//private Map<String, Facture> map = new HashMap<String, Facture>();
	
	
	public boolean verifierFacture(Facture facture) {
		return  super.verifierDocument(facture);
	}
	
	public Facture ajouterFacture(int code, Client client) {
		Facture facture = new Facture();
		facture.setCode(code);
		facture.setClient(client);
		
		return (Facture) ajouterDocument(facture);
	}
	
	public void ajouterLigneProduit(Facture facture, DetailDocument detailDocument) {
			AjouterLigneProduit(facture, detailDocument);
	}
	
	public Facture retrouverFacture(String key) {
		return  (Facture) retrouverDocument(getKey(key));
	}
	
	
	public String getKey(String key) {
		return "Facture-"+key;
	}

}
