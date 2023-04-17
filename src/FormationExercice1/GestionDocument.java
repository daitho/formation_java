package FormationExercice1;

import java.util.HashMap;
import java.util.Map;

public class GestionDocument {
	private Map<String, Document> map = new HashMap<String, Document>();
	
	
	//Ajout
	public void ajouterDocument(Document document) {
		if(!verifierDocument(document)) {
			map.put(document.getCode(), document);
			System.out.println("Succès !" );
		}
		
	}
	
	//Pour verifier si le produit existe
	private boolean verifierDocument(Document document) {
		return document != null && map.containsKey(document.getCode());
	}
	
	public void AjouterLigneProduit(String key, DetailDocument detailDocument) {
		if(map.containsKey(key)) {
			map.get(key).getListe().add(detailDocument);
		}else {
			System.err.println("Erreur !");
		}
	}
	
	public void afficherDocument(Document document) {
		System.out.println("Nom du client: "+document.getClient().getNom()+" "+document.getClient().getPrenom());
		System.out.println("Montant total "+document.calculMontant()+"€");
	}

}
