package FormationExercice1.gestion;

import FormationExercice1.Client;
import FormationExercice1.DetailDocument;
import FormationExercice1.Document;
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
		try {
			facture.setCode(facture.getKey());
		} catch (Exception e) {
			e.printStackTrace();
		}
		ajouterDocument(facture);
	}
	
	public void ajouterLigneProduit(Document document, DetailDocument detailDocument) {
		try {
			AjouterLigneProduit(document, detailDocument);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void afficherFacture(Facture facture) {
		System.out.println(facture.getCode());
	}
	
	public Facture retrouverFacture(String key) {
		return  (Facture) retrouverDocument(getKey(key));
	}
	
	public void afficherListeDetailFacture(Facture facture) {
		afficherDocument(facture);
	}
	
	public String getKey(String key) {
		return "Facture-"+key;
	}

}
