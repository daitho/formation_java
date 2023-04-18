package FormationExercice1;

import java.util.Date;
import java.util.List;

public class Devis extends Document {

	public Devis() {
		super();
	}

	public Devis(String code, String date, double montant, Client client, List<DetailDocument> liste) {
		super(code, date, montant, client);
	}

	@Override
	public String toString() {
		return "Devis\n\"Nom et prénom:  " + this.getClient().getNom() +" "+this.getClient().getPrenom() +" calculMontant()=" + this.calculMontant();
	}

	
	
	
	

}
