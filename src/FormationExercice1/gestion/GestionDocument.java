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
	
	protected void AjouterLigneProduit(Document document, DetailDocument detailDocument){
    	for(Document documentMap : map.values()) {
    		if(documentMap.getCode()==(document.getCode())) {
    			documentMap.getListeDetail().add(detailDocument);
    			System.out.println("produit ajouté !" );
    		}
    	}
    }
	
//	protected void AjouterLigneProduit(Document document, DetailDocument detailDocument) {
//		if(!verifierDocument(document.getCode())) {
//			map.get(document.getCode()).getListeDetail().add(detailDocument);
//		}else {
//			System.err.println("Erreur !");
//		}
//		
//	}	
	
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
	
	
	

	

}
