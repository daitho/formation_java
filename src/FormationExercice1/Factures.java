package FormationExercice1;

import java.util.Date;
import java.util.List;

public class Factures extends Document {

	public Factures() {
		super();

	}

	public Factures(String code, Date date, double montant, Client client) {
		super(code, date, montant, client);
	}

	@Override
	public double calculMontant() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
