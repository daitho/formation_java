package FormationExercice1.gestion;

import FormationExercice1.Client;
import FormationExercice1.DetailDocument;
import FormationExercice1.Facture;

public class GestionFacture extends GestionDocument{
	//private Map<String, Facture> map = new HashMap<String, Facture>();
	
	
	public boolean verifierFacture(Facture facture) {
		
		return  super.verifierDocument(facture);
	}
	
	public void ajouterFacture(String code, Client client) {
		Facture facture = new Facture();
		facture.setCode(code);
		facture.setClient(client);
		
		if(!verifierFacture(facture)) {
			ajouterDocument(facture);
			
			System.out.println("Facture ajouté !");
		}else {
			System.err.println("Facture non ajouter");
		}
	}
	
	public void ajouterLigneProduit(String key, DetailDocument detailDocument) {
		AjouterLigneProduit(getKey(key), detailDocument);
	}
	
	public void afficherFacture(Facture facture) {
		System.out.println(facture.getCode());
	}
	
	public Facture retrouverFacture(String key) {
		return  (Facture) retrouverDocument(getKey(key));
	}
	
	public void afficherListeFacture(String key) {
		afficherDocument(getKey(key));
	}
	
	public String getKey(String key) {
		return "Facture-"+key;
	}

}
