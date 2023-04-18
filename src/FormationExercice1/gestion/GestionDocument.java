package FormationExercice1.gestion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import FormationExercice1.DetailDocument;
import FormationExercice1.Document;

public abstract class GestionDocument {
	private Map<String, Document> map = new HashMap<String, Document>();
	
	
	//Ajout
	protected void ajouterDocument(Document document){
		if(!verifierDocument(document)) {
			DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			document.setDate(format.format(date));
			
			try {
				map.put(document.getKey(), document);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Succès !" );
		}
		
	}
	
	protected void AjouterLigneProduit(String key, DetailDocument detailDocument) {
		if(!verifierDocument(key)) {
			map.get(key).getListe().add(detailDocument);
		}else {
			System.err.println("Erreur !");
		}
	}	
	
	//Pour verifier si le produit existe
	protected boolean verifierDocument(Document document) {
		try {
			return document != null && verifierDocument(document.getKey());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	protected boolean verifierDocument(String key) {
		return  map.containsKey(key);
	}
	
	protected Document retrouverDocument(String key) {
		return map.get(key);
	}
	
	protected void afficherDocument(String key) {
		System.out.println("Nom du client: "+map.get(key).getClient().getNom()+" "+map.get(key).getClient().getPrenom());
		System.out.println("Montant total "+map.get(key).calculMontant()+"€");
	}
	
	

	

}
