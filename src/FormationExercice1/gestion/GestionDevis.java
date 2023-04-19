package FormationExercice1.gestion;

import FormationExercice1.Client;
import FormationExercice1.DetailDocument;
import FormationExercice1.Devis;

public class GestionDevis extends GestionDocument{
	
	public boolean verifierDevis(Devis devis) {
		return  super.verifierDocument(devis);
	}
	
	public Devis ajouterDevis(int code, Client client) {
		Devis devis = new Devis();
		devis.setCode(code);
		devis.setClient(client);
		
		return (Devis) ajouterDocument(devis);
	}
	
	public void ajouterLigneProduit(Devis devis, DetailDocument detailDocument) {
			ajouterLigneProduit(devis, detailDocument);
	}
	
	public Devis retrouverDevis(String key) {
		return  (Devis) retrouverDocument(getKey(key));
	}
	
	
	public String getKey(String key) {
		return "Devis-"+key;
	}

}
