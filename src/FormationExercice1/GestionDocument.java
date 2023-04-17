package FormationExercice1;

import java.util.HashMap;
import java.util.Map;

public class GestionDocument {
	private Map<String, Document> map = new HashMap<String, Document>();
	
	
	//Ajout
	public void ajouterDetailDocument(Document document) {
		if(!verifierDocument(document)) {
			map.put(document.getCode(), document);
			System.out.println("Succès !" );
		}
		
	}
	
	//Pour verifier si le produit existe
	private boolean verifierDocument(Document document) {
		return document != null && map.containsKey(document.getCode());
	}
	
	

}
