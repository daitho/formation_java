package FormationExercice1;

import java.util.Date;
import java.util.List;

public class Devis extends Document {

	public Devis() {
		super();
	}

	public Devis(String code, Date date, double montant, Client client, List<DetailDocument> liste) {
		super(code, date, montant, client);
	}

	
	
	
	

}
