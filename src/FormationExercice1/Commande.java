package FormationExercice1;

public class Commande extends Document {
	
	
	

	public Commande() {
		super();
	}

	public Commande(String code, String date, double montant, Client client) {
		super(code, date, montant, client);
	}
	
	public String getKey() throws Exception {
		//throw new Exception("La methode getKey doit être surcharger");
		return "Commande-"+getCode();
	}
	
	

}
