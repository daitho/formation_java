package FormationExercice1.gestion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import FormationExercice1.Document;

public abstract class GestionDocument {
	private Map<String, Document> map = new HashMap<String, Document>();
	
	
	//Ajout
	protected Document ajouterDocument(Document document){
		if(!verifierDocument(document)) {
			DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			document.setDate(format.format(date));
			
			try {

				System.out.println("Succès !" );
				map.put(document.getKey(), document);
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Erreur !" );
			}
		}
		
		return document;
		
	}
	
	protected boolean supprimerDocument(Document document) throws Exception{
		if(verifierDocument(document)) {
			map.remove(document.getKey());
			return true;
		}
		return false;
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
		if(verifierDocument(key)) {
			return map.get(key);
		}
		return null;
	}
	
	
	

	

}
