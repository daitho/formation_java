package FormationExercice1;

import java.util.HashMap;
import java.util.Map;

public class GestionDocument {
	private Map<Integer, Document> map = new HashMap<Integer, Document>();
	
	//Ajout
	public void ajouterDetailDocument(int key, Document document) {
		boolean statut = false;
		for (Map.Entry<Integer, Document> entry : map.entrySet()) {
			if(entry.getKey().equals(key) || entry.getValue().getCode().equals(document.getCode())) {
				statut = true;
			}
		}
		
		if(statut == false) {
			map.put(key, document);
			System.out.println("Succès !" );
			
		}else {
			System.out.println("Une erreur s'est produit lors de l'ajout !" );
		}
	}
	
	

}
