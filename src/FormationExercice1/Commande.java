package FormationExercice1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Commande extends Document {
	
	
	

	public Commande() {
		super();
	}

	public Commande(String code, Date date, double montant, Client client) {
		super(code, date, montant, client);
	}

	@Override
	public double calculMontant() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
