package FormationExercice1;

import java.util.Date;

public class Factures extends Document {

	public Factures() {
		super();

	}

	public Factures(String code, Date date, double montant, Client client) {
		super(code, date, montant, client);
	}
	
	

}
