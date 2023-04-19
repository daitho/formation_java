package FormationExercice1;

import java.util.Collections;
import java.util.List;

public class Facture extends Document {

	public Facture() {
		super();

	}

	public Facture(int code, String date, double montant, Client client) {
		super(code, date, montant, client);
	}
	
	public String getKey() throws Exception {
		//throw new Exception("La methode getKey doit être surcharger");
		return "Facture-"+getCode();
	}
	
//	@Override
//	public String toString() {
//		return "Facture : "+this.calculMontant()+""
//				+"\n"+super.toString();
//	}
	
}
