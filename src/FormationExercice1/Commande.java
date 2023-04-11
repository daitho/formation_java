package FormationExercice1;

import java.util.Date;

public class Commande extends Document {

	public Commande() {
		super();
	}

	public Commande(String code, Date date, double montant, Client client) {
		super(code, date, montant, client);
	}
	
	

}
